public class fifthPractcie {
  public static int maxSubArray(int[] nums) {
    int n = nums.length, maxSum = nums[0], sum = nums[0];
    for (int i = 1; i < n; i++) {
      sum = Math.max(nums[i], sum + nums[i]);
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(maxSubArray(a));
  }
}
