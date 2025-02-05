class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        ArrayList<Character> mismatched = new ArrayList<>();

        int mismatchCount = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(mismatchCount>2){
                    return false;
                }
                mismatched.add(s1.charAt(i));
                mismatched.add(s2.charAt(i));
                mismatchCount += 1;
            }
        }
        if(mismatched.size()==4){
            return (mismatched.get(0)==mismatched.get(3))&&(mismatched.get(1)==mismatched.get(2));
        }
        return false;
    }
}
