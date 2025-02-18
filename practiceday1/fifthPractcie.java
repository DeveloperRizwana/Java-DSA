public class fifthPractcie {
  public static void sortColors(int[] nums) {
    int n = nums.length;
    int zeroes = 0, twos = n - 1, i = 0;
    while (i <= twos) {
      if (nums[i] == 0) {
        swap(nums, zeroes, i);
        zeroes++;
        i++;
      } else if (nums[i] == 1) {
        i++;
      } else if (nums[i] == 2) {
        swap(nums, i, twos);
        twos--;
      }

    }

  }

  public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 0 };
    sortColors(a);
    for (int i = 0; i < a.length; i++) {
      System.err.print(a[i] + " ");
    }
  }
}
