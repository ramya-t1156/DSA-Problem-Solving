class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>result = new ArrayList<>();
        //for computing maximum frequency of characters in words2
        int[] maxFreq = new int[26];

        // to compute  max freq
        for(int i = 0;i<words2.length;i++){
            int[] freq = calculateFreq(words2[i]);
            for(int j = 0;j<26;j++){
                maxFreq[j] = Math.max(maxFreq[j],freq[j]);
            }
        }

        for(int i = 0;i<words1.length;i++){
            int[] freq = calculateFreq(words1[i]);
            boolean isUniversal = true;
            for(int j = 0;j<26;j++){
                if(freq[j]<maxFreq[j]){
                    isUniversal = false;
                    break;
                }
            }
            if(isUniversal==true){
                result.add(words1[i]);
            }
        }
        return result;
    }
    public int[] calculateFreq(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }
        return freq;
    }
}
