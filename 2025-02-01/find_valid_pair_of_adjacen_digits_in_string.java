class Solution {
    public String findValidPair(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(int i = 0;i<s.length()-1;i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            if(first != second && freq.get(first)==Character.getNumericValue(first) && freq.get(second)==Character.getNumericValue(second)){
                return "" + first + second;
            }
        }
        return "";
    }
}
