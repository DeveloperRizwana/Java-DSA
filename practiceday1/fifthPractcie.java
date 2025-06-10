import java.util.HashMap;

public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void sortColors(int[] nums) {
    int n = nums.length, zeroS = 0, twoS = n - 1, i = 0;
    while (i <= twoS) {
      if (nums[i] == 0) {
        swap(nums, i, zeroS);
        
        i++;
        zeroS++;
      } else if (nums[i] == 1) {
        i++;
      } else if (nums[i] == 2) {
        swap(nums, i, twoS);
        twoS--;
      }

    }

  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 2,0,1 };
    sortColors(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
