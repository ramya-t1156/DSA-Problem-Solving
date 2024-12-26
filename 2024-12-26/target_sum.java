class Solution {
    public int helper(int[] nums , int target , int idx , int sum){
        if(idx==nums.length){
            return sum==target?1:0;
        }
        int add = helper(nums,target,idx+1,sum+nums[idx]);
        int sub = helper(nums,target,idx+1,sum-nums[idx]);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
}
