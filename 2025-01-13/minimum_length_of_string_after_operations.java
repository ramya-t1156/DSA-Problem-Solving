class Solution {
    public int minimumLength(String s) {
        int[] count = new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        int result = 0;
        for(int num:count){
            if(num==0){
                continue;
            }
            if(num%2==0){
                result += 2;
            }
            else{
                result += 1;
            }
        }
        return result;
    }
}
