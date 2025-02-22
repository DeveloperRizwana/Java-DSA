public class fifthPractcie {
  public static int maxProfit(int[] prices) {
    int profit = 0, buy = Integer.MAX_VALUE;
    int n = prices.length;
    for (int i = 0; i < n - 1; i++) {
      if (prices[i] < buy) {
        buy = prices[i];
      }
      profit = Math.max(profit, prices[i + 1] - buy);
    }
    return profit;

  }

  public static void main(String[] args) {
    int[] a = { 7, 6, 4, 3, 1 };
    System.out.println(maxProfit(a));
  }
}
