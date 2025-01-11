public class buyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            // sell = Math.max(sell, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2 };
        System.out.println(maxProfit(a));
    }
}
