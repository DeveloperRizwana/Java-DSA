public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static boolean check(int[] nums) {
    int n = nums.length, count = 0;
    for (int i = 1; i < n; i++) {
      if (nums[i - 1] > nums[i]) {
        count++;
      }
      
    }
    if (nums[nums.length - 1] > nums[0]) {
      count++;  
    }
    return count <= 1;
  }

  public static void main(String[] args) {
    int[] a = { 3, 4, 5, 1, 2 };
    System.out.println(check(a));
  }
}
