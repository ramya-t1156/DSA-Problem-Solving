class Solution {
    public int findMin(int[] nums){
        int min = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min = i;
            }
        }
        return min; 
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {        
        for(int i = 0;i<k;i++){
            int idx = findMin(nums);
            nums[idx] = nums[idx]*multiplier;
        }
        return nums;
    }
}
