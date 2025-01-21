class Solution {
    public long gridGame(int[][] grid) {
        long topSum = 0 , bottomSum = 0;
        for(int i = 0; i < grid[0].length ; i++){
            topSum += grid[0][i];
        }
        long points = Long.MAX_VALUE;
        for(int i = 0; i < grid[0].length ; i++){
            topSum -= grid[0][i];
            points = Math.min(points,Math.max(topSum,bottomSum));
            bottomSum += grid[1][i];
        }
        return points;
    }
}
