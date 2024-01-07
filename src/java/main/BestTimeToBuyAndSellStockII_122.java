public class BestTimeToBuyAndSellStockII_122 {

    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int currentPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - currentPrice;
            if (profit > 0) {
                totalProfit += profit;
            }
            currentPrice = prices[i];
        }
        return totalProfit;
    }
}
