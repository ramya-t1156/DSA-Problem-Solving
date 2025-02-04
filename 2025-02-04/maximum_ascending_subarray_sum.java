class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0] , currentSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            maxSum = Math.max(maxSum,currentSum);
            if(nums[i]>nums[i-1]){
                currentSum += nums[i];
            }
            else{
                currentSum = nums[i];
            }
        }
        maxSum = Math.max(maxSum,currentSum);
        return maxSum;
    }
}
