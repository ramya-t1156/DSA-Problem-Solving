class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = prices;
        for(int i = 0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    answer[i] = Math.abs(prices[j]-prices[i]);
                    break;
                }
            }
        }
        return answer;
    }
}
