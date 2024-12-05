class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1){
            return;
        }
        int nonZero = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0){
                nums[nonZero] = nums[i];
                if(nonZero!=i){
                    nums[i] = 0;
                }
                nonZero++;
            }
        }       
    }
}
