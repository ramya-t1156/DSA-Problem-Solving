class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0,right = numbers.length-1;
        while(left<=right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
            if(sum>target){
                right--;
            }
            if(sum<target){
                left++;
            }
        }
        return result;
    }
}
