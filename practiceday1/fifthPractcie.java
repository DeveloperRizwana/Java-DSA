import java.util.HashMap;

public class fifthPractcie {
  public static int longestSubarray(int[] arr, int k) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    int maxLength = 0, prefSum = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      prefSum += arr[i];
      if (mp.containsKey(prefSum - k)) {
        maxLength = Math.max(maxLength, (prefSum - k) - i);
      } else {
        mp.put(prefSum, i);
      }
    }

    return maxLength;
  }

  public static void main(String[] args) {
    int[] a = { 10, -10, 20, 30 };
    // System.out.println(longestSubarray(a,));
    System.out.println(longestSubarray(a, 5));
  }
}
