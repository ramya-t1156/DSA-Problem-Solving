class Solution {
    boolean isValid(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    public int dfs(int[][] grid , int x , int y , int n , int m){
        int fishCount = grid[x][y];
        grid[x][y] = 0;
        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
        for(int i = 0;i<4;i++){
            int newX = x+dir[i][0];
            int newY = y+dir[i][1];
            if(isValid(newX,newY,n,m) && grid[newX][newY]>0){
                fishCount += dfs(grid,newX,newY,n,m);
            }
        }
        return fishCount;
    }

    public int findMaxFish(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxFish = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]>0){
                    maxFish = Math.max(maxFish,dfs(grid,i,j,n,m));
                }
            }
        }
        return maxFish;
    }
}
