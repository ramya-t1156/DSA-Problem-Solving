class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<=2) return 0;

        int maxLeft = height[0] , maxRight = height[n-1];
        int left = 0 , right = n-2;
        int trappedWater = 0;

        while(left<=right){
            if(maxLeft < maxRight){
                if(maxLeft < height[left]){
                    maxLeft = height[left];
                }
                else{
                    trappedWater += (maxLeft - height[left]);
                    left++;
                }
            }
            else{
                if(maxRight < height[right]){
                    maxRight = height[right];
                }
                else{
                    trappedWater += (maxRight - height[right]);
                    right--;
                }
            }
        }
        return trappedWater;
    }
}
