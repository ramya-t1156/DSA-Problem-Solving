// Time Complexity - O(n logn)
class Solution {
    public int hammingDistance(int x, int y) {
        int xorVal = x^y;
        int count = 0;
        while(xorVal>0){
            if((xorVal & 1)>0){
                count++;
            }
            xorVal =xorVal>>1;
        }
        return count;
    }
}
