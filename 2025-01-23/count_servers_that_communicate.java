class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int servers = 0;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            if(rowCount[x]>1 || colCount[y]>1){
                servers++;
            }
        }
        return servers;
    }
}
