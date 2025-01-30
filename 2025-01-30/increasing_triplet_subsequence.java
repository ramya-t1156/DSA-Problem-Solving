class Solution {
    // is an number greater than any two distinct numbers menasthere exists an third number whichis greater than first , second (here first<second<n)=> return true 
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int first = Integer.MAX_VALUE ,  second = Integer.MAX_VALUE;
        for(int n : nums){
            if(n<=first){
                first = n;
            }
            else if(n<=second){
                second = n;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
