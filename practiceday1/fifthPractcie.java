import java.util.ArrayList;
import java.util.List;

public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int search(int[] nums, int target) {
    int n = nums.length;
    int st = 0, end = n - 1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (target == nums[mid]) {
        return mid;
      } else if (target > nums[mid]) {
        st = mid + 1;
      } else {
      
        end = mid - 1;
      }
      
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = { -1,0,3,5,9,12 };
    int result = search(a, 2);
    System.out.println("Result : " + result);
  }
}
