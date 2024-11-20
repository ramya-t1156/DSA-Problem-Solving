class Solution {
public:
    int sumOfEncryptedInt(vector<int>& nums) {
        int sum = 0;
        for(int i = 0;i<nums.size();i++){
            nums[i] = encrypt(nums[i]);
            sum += nums[i];
        }
        return sum;
        
    }
    int encrypt(int n){
        int max = n%10;
        int temp = n;
        int i =0;
        while(temp>0){
            if(temp%10>max){
                max = temp%10;
            }
            temp /= 10;
            i++;
        }
        n = 0;
        while(i>0){
            n = n*10 + max;
            i--;
        }
        return n;
    }
};
