import java.util.Arrays;

public class fifthPractcie {
  public static void nextPermutation(int[] nums) {
    int n = nums.length, idx = -1;
    for (int i = n - 1; i > 0; i--) {
      if (nums[i] > nums[i - 1]) {
        idx = i - 1;
        break;
      }
    }
    if (idx == -1) {
      reverse(nums, 0, n - 1);
    }
    for (int i = n - 1; i > idx; i--) {
      if (nums[i] > nums[idx]) {
        swap(nums, i, idx);
        break;
      }
    }
    reverse(nums, idx + 1, n - 1);

  }

  public static void reverse(int[] a, int i, int j) {
    while (i > j) {
      swap(a, i, j);
      i++;
      j--;
    }
  }

  public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 3, 2, 1 };
    nextPermutation(a);
    // for(int i = 0; i < a.length; i++){
    // System.out.print(a[i] + " ");
    // }
    System.out.println(Arrays.toString(a));
  }
}
