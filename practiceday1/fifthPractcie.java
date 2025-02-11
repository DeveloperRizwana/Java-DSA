public class fifthPractcie {
  public static int longestSubarray(int[] nums, int k) {
    int maxLength = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      int  sum = 0;
      for (int j = i; j < n; j++) {
        sum += nums[j];
        if (sum == k) {
          maxLength = Math.max(maxLength, (j - i) + 1);
        }
      }
    }
    return maxLength;
  }
  public static void main(String[] args) {
    int[] a = { 94, -33, -13, 40, -82, 94, -33, -13, 40, -82
    };
    System.out.println(longestSubarray(a, 52));
  }
}
