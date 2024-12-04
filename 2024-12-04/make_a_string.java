class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int targetIdx = 0;
        int targetSize = str2.length();
        for(char currentChar:str1.toCharArray()){
            if(targetIdx<targetSize&&(str2.charAt(targetIdx)-currentChar+26)%26<=1){
                targetIdx++;
            }
        }
        return targetIdx==targetSize;
    }
}
