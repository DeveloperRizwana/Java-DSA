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

  public static int findMaxConsecutiveOnes(int[] nums) {
    int n = nums.length, max = 0, maxOne = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] == 1) {
        max++;
        maxOne = Math.max(maxOne, max);
      } else {
        max = 0;
      }
    }
    return maxOne;

  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 1 };
    System.out.println(findMaxConsecutiveOnes(a));
  }
}
