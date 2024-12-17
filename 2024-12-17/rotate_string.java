class Solution {
    public String rotateString(String s1 , int idx){
        StringBuilder s2 = new StringBuilder();
        int n = s1.length();
        s2.append(s1.substring(idx,n));
        s2.append(s1.substring(0,idx));
        return s2.toString();
    }
    public boolean rotateString(String s, String goal) {
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<goal.length();j++){
                if(s.charAt(i)==goal.charAt(j)){
                    String s1 = rotateString(goal,j);
                    if(s1.equals(s)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
