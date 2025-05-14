public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void moveZeroes(int[] nums) {
    int n = nums.length, x = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        swap(nums, i, x);
        x++;
      }
    }

  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 1,0,1 };
    moveZeroes(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
