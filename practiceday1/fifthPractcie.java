import java.util.Arrays;
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

  public static int[][] transpose(int[][] matrix) {
    int n = matrix.length, m = matrix[0].length;
    int[][] result = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        result[j][i] = matrix[i][j];
      }
    }
    return result;

  }

  public static void main(String[] args) {
    int[][] a = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
    };
    // int[][] result = transpose(a);
    // System.out.println(Arrays.toString(result));
    System.out.println("Input MAtrix");
    printMatrix(a);

    int[][]result = transpose(a);

    System.out.println("output MAtrix");
    printMatrix(result);
  }
}
