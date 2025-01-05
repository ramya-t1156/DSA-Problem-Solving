class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int countPalindromicSubsequence(String s) {
        Pair[] arr = new Pair[26];
        for(int i = 0;i<26;i++){
            arr[i] = new Pair(-1,-1);
        }
        for(int i = 0;i<s.length();i++){
            if(arr[s.charAt(i)-'a'].first==-1){
                arr[s.charAt(i)-'a'].first = i;
            }
            else{
                arr[s.charAt(i)-'a'].second = i;
            }
        }
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].first!=-1&&arr[i].second!=-1){
                HashSet<Character>hs = new HashSet<>();
                for(int j = arr[i].first+1;j<arr[i].second;j++){
                    hs.add(s.charAt(j));
                }
                count += hs.size();
            }
        }
        return count;
    }
}