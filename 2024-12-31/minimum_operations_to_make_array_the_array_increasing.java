class Solution {
    public int minOperations(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        for(int i = 0;i<nums.length-1;i++){
            if(arr[i+1]<=arr[i]){
                arr[i+1] = arr[i]+1;
            }
        }
        int operations = 0;
        for(int i = 0;i<nums.length;i++){
            operations += arr[i]-nums[i];
        }
        return operations;
    }
}
