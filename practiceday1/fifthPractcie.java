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
    int result = 0;
    for (int i = 0; i < n; i++) {
      result ^= nums[i];
    }
    return result;
  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 3, 1 };
    System.out.println(singleNumber(a));
  }
}
