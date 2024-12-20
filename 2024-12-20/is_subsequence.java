class Solution {
    public int isPresent(String t , char ch , int idx){         
        for(int i = idx+1;i<t.length();i++){
            if(t.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
    public boolean isSubsequence(String s, String t) {
        int idx = -1;
        for(int i = 0;i<s.length();i++){
            idx = isPresent(t,s.charAt(i),idx);
            if(idx==-1){
                return false;
            }
        }
        return true;
    }
}
