public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int removeDuplicates(int[] nums) {
    int x = 0, n = nums.length;
    for (int i = 0; i < n - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[x++] = nums[i];
      }
    }
    nums[x++] = nums[n - 1];
    return x;

  }

  public static void main(String[] args) {
    int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    System.out.println(removeDuplicates(a));
  }
}
