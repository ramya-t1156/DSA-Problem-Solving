class Solution {
public:
    bool isHappy(int n) {
        int slow = n , fast = n;
        do{
            slow = getSquare(slow);
            fast = getSquare(getSquare(fast));
        }while(slow!=fast);
        return slow==1;
    }

    int getSquare(int n){
        int sum = 0;
        while(n>0){
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
};
