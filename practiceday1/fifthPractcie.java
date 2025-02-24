import java.util.Arrays;

public class fifthPractcie {
  public static int[] rearrangeArray(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int j = 0, k = 1;
    for (int i = 0; i < n; i++) {
      if (nums[i] > 0) {
        result[j] = nums[i];
        j += 2;
      } else {
        result[k] = nums[i];
        k += 2;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] a = { 3, 1, -2, -5, 2, -4 };
    int[] result = rearrangeArray(a);
    System.out.println(Arrays.toString(result));
  }
}
