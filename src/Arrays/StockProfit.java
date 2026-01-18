package Arrays;

public class StockProfit {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minimum) {
                minimum = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minimum);
            }
        }
        return maxProfit;
    }
}
