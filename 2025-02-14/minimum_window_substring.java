class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(n<t.length()){
            return "";
        }
        String ans = "";
        int[] freq = new int[256];
        int[] curr = new int[256];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int l = 0,r =0;
        int minLength = Integer.MAX_VALUE;
        while(r<n){
            curr[s.charAt(r)]++;
            while(containsAll(freq,curr)){
                if(r-l+1<minLength){
                    minLength = r-l+1;
                    ans = s.substring(l,r+1);
                }
                curr[s.charAt(l)]--;
                l++;
            }
            r++;
        }
        return ans;
    }
    public static boolean containsAll(int[] freq , int[] curr){
        for(int i = 0;i<256;i++){
            if(freq[i]>0 && freq[i]>curr[i]){
                return false;
            }
        }
        return true;
    }
}
