public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int linearSearch(int nums[], int target) {
    // Your code goes here
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 2, 3, 4, 5, 3 };
    System.out.println(linearSearch(a, 3));
    // for (int i = 0; i < a.length; i++) {
    // System.out.print(a[i] + " ");
    // }
  }
}
