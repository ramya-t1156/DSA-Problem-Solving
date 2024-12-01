class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        int prev3 = 0;
        int prev2 = 1;
        int prev1 = prev2 + prev3;
        for(int i = 3;i<=n;i++){
            int current = prev1+prev2+prev3;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
