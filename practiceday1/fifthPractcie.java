import java.util.HashMap;

public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int longestSubarray(int[] arr, int k) {
    // code here
    HashMap<Integer, Integer> mp = new HashMap<>();
    int n = arr.length, prefSum = 0, maxLength = 0;
    for (int i = 0; i < n; i++) {
      prefSum += arr[i];
      if (prefSum == k) {
        maxLength = i + 1;
      }
      if (mp.containsKey(prefSum - k)) {
        maxLength = Math.max(maxLength, (i - mp.get(prefSum - k)));
      }
      mp.putIfAbsent(prefSum, i);
    }
    return maxLength;

  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 10, -10, 20, 30 };
    System.out.println(longestSubarray(a, 5));
  }
}
