import java.util.Arrays;

public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void setZeroes(int[][] matrix) {

  }

  public static void main(String[] args) {
    int[][] a = {
        { 0, 1, 2, 0 },
        { 3, 4, 5, 2 },
        { 1, 3, 1, 5 },
    };
    System.out.println("Input Matrix");
    printMatrix(a);
  }
}
