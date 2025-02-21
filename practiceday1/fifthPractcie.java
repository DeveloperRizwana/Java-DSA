public class fifthPractcie {
  public static int pairWithMaxSum(int arr[]) {
    int max = Integer.MIN_VALUE;
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      max = Math.max(max, arr[i - 1] + arr[i]);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] a = { 5, 4, 3, 1, 6 };
    System.out.println(pairWithMaxSum(a));
  }
}
