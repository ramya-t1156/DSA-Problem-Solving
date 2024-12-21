import java.lang.Math.*;
class Solution {
    public int findMax(int[] gifts){
        int max = 0;
        for(int i = 0;i<gifts.length;i++){
            if(gifts[i]>gifts[max]){
                max = i;
            }
        }
        return max;
    }
    public long pickGifts(int[] gifts, int k) {
        long num_gifts = 0;
        for(int i = 0;i<k;i++){
            int idx = findMax(gifts);
            int pile = (int)Math.sqrt(gifts[idx]);
            gifts[idx] = pile;
        }
        for(int i = 0;i<gifts.length;i++){
            num_gifts += gifts[i];
        }
        return num_gifts;
    }
}
