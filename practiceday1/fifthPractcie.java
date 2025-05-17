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

  public static int missingNumber(int[] nums) {
    int n = nums.length, k = 1;
    for (int i = 0; i < n; i++) {
      if (nums[i] == k) {
        k++;
        i = -1;
      }
    }
    return k;
  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 3, 0, 1 };
    System.out.println(missingNumber(a));
  }
}
