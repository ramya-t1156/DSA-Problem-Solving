class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = Integer.MIN_VALUE;
        int maxLeft = values[0];
        for(int i = 1;i<values.length;i++){
            maxScore = Math.max(maxScore , maxLeft+values[i]-i);
            maxLeft = Math.max(maxLeft,values[i]+i);
        }
        return maxScore;
    }
}
