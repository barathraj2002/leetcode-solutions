// Last updated: 3/14/2026, 11:51:02 AM
class Solution {
    public int maxProfit(int[] prices) {
        int previous_smaller = Integer.MAX_VALUE; 
        int profit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(previous_smaller > prices[i] ){
                previous_smaller = prices[i];
            }
            if(prices[i] > previous_smaller){
                int temp_profit = prices[i] - previous_smaller;
                if(temp_profit > profit){
                    profit = temp_profit;
                }
            }
        }

        return profit;
    }
}