class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(x==-1){
            return (n%2==0)?1.0:-1.0;
        }
        if(n==Integer.MIN_VALUE){
            x = 1/x;
            n = Integer.MAX_VALUE;
        }
        
        if(n<0){
            x = 1/x;
            n = -n;
        }
        double ans = 1;
        while(n>0){
            if(n%2==1){
                ans = ans*x;
            }
            x = x*x;
            n = n/2;
        }
        return ans;
    }
}
