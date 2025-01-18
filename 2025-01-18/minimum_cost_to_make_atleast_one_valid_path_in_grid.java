class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        PriorityQueue<int[]>pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.offer(new int[]{0,0,0});

        boolean[][] visited = new boolean[m][n];

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int cost = curr[0] , x = curr[1] , y = curr[2];

            if(visited[x][y]) continue;
            visited[x][y] = true;

            if(x == m-1 && y == n-1) return cost;

            for(int i = 0;i<4;i++){
                int newX = x + directions[i][0];
                int newY = y + directions[i][1];

                if(newX>=0 && newX<m && newY>=0 && newY<n){
                    int newCost = cost + (i+1 == grid[x][y]?0:1);
                    pq.offer(new int[]{newCost,newX,newY});
                }
            }
        }
        return 0;
    }
}
