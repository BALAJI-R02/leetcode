// Last updated: 2/11/2026, 2:01:20 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        if (prices.length == 1) {
            return 0;
        }

        for (int i = 1; i < prices.length; i++) {
            int current = prices[i];
            if (min > current) {
                min = current;
            } else {
                int currentProfit = current - min;
                if (profit < currentProfit) {
                    profit = currentProfit;
                }
            }
        }

        return profit;
    }
}