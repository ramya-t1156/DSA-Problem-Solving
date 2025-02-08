// result=(p_count!×np_count!)mod(10^9+7)
class Solution {
public:
    const int MOD = 1e9+7; // 1e9 => 10^9
    long long factorial(int n){
        long long ans = 1;
        for(int i = 1;i<=n;i++){
            ans = (ans*i)%MOD;
        }
        return ans;
    }
    int countPrimes(int n){
        vector<bool>isPrime(n+1,true);
        isPrime[0]=isPrime[1]=false;
        for(int i = 2; i*i<=n;i++){
            if(isPrime[i]){
                for(int j = 2;i*j<=n;j++){
                    isPrime[i*j] = false;
                }
            }
        }
        return count(isPrime.begin(),isPrime.end(),true);
    }
    int numPrimeArrangements(int n) {
        int p_count = countPrimes(n);
        int np_count = n-p_count;
        return (factorial(p_count)*factorial(np_count))%MOD;
    }
};
