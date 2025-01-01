class Solution {
    public int toSum(String n1,String n2){
        int count = 0;
        for(int i = 0;i<n1.length();i++){
            if(n1.charAt(i)=='0'){
                count++;
            }
        }
        for(int j = 0;j<n2.length();j++){
            if(n2.charAt(j)=='1'){
                count++;
            }
        }
        return count++;
    }
    public int maxScore(String s) {
        int result = Integer.MIN_VALUE, current;
        int left = 0,mid=1,right=s.length()-1;
        String l , r ;
        int n1 , n2;
        while(mid<=right){
            l = s.substring(left,mid);
            r = s.substring(mid,right+1);
            mid++;
            current = toSum(l,r);
            if(current>result){
                result = current;
            }
        }
        return result;
    }
}
