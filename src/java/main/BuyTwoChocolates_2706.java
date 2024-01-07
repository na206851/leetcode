import java.util.Arrays;

public class BuyTwoChocolates_2706 {

    public Integer buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return prices[0] + prices[1] <= money ? money - prices[0] - prices[1] : money;
    }
}
