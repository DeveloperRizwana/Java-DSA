public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int secondLargestElement(int[] nums) {
    int max = Integer.MIN_VALUE, secondMax = -1, n = nums.length;
    for (int i = 0; i < n; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    for (int i = 0; i < n; i++) {
      if (nums[i] == max) {
        nums[i] = -1;
      } else if (nums[i] > secondMax) {
        secondMax = nums[i];
      } 
    }
    return secondMax;
  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 10,10,10,10};
    System.out.println(secondLargestElement(a));
    // for (int i = 0; i < a.length; i++) {
    // System.out.print(a[i] + " ");
    // }
  }
}
