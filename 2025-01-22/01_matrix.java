// solved using BFS
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] distance = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }
                else{
                    distance[i][j] = -1;
                }
            }
        }
        int[][] path = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            for(int i = 0;i<4;i++){
                int newX = x+path[i][0];
                int newY = y+path[i][1];

                if(newX>=0 && newY >=0 && newX<m && newY<n && distance[newX][newY]==-1){
                    distance[newX][newY] = distance[x][y]+1;
                    q.offer(new int[]{newX,newY});
                }
            }
        }
        return distance;
    }
}
