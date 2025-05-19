import java.util.ArrayList;

public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int singleNumber(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (nums[i] == nums[j]) {
          nums[i] = 0;
          nums[j] = 0;
        }
      }
      if (nums[i] != 0) {
        return nums[i];
      }
    }
    // for (int i = 0; i < n; i++) {
    // if (nums[i] != 0) {
    // return nums[i];
    // }
    // }
    return 0;
  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 1, 0, 1 };
    System.out.println(singleNumber(a));
  }
}
