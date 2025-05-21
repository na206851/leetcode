import java.util.Arrays;

class BestTimeToBuyAndSellClock_121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int[] arr = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            arr[i - 1] = prices[i] - min;
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}