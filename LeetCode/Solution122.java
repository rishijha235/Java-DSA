public class Solution122 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > 0) {
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;

    }
}
