class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        int ways = 0;
        for(int i = 0;i<nums.length-1;i++){
            long leftSum = prefix[i];
            long rightSum = prefix[nums.length-1]-leftSum;
            if(leftSum>=rightSum){
                ways++;
            }
        }
        return ways;
    }
}
