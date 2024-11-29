class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        for(int num:prices){
            min_price = Math.min(min_price,num);
            max_profit = Math.max(max_profit,num-min_price);
        }
        return max_profit;
    }
}
