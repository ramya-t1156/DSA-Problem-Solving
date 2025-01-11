class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        int oddCount = 0;
        int[] charCount = new int[26];
        for(char ch : s.toCharArray()){
            charCount[ch-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(charCount[i]%2!=0){
                oddCount++;
            }
        }
        return oddCount<=k;
    }
}
