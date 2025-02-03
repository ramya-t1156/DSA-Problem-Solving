class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1 ,dec = 1;
        int inc_MAX = 0 , dec_MAX = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
            }
            else{
                inc_MAX = Math.max(inc,inc_MAX);
                inc = 1;
            }
            if(nums[i]>nums[i+1]){
                dec++;
            }
            else{
                dec_MAX = Math.max(dec,dec_MAX);
                dec = 1;
            }
        }
        inc_MAX = Math.max(inc,inc_MAX);
        dec_MAX = Math.max(dec,dec_MAX);
        return Math.max(inc_MAX,dec_MAX);        
    }
}
