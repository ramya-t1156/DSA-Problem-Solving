int sumOfTheDigitsOfHarshadNumber(int x) {
    int num=0,div,ans=x;
    while(x!=0){
        div=x%10;
        num+=div;
        x/=10;
    }
    if(ans%num==0){
        return num;
    }
    else{
        return -1;
    }
}
