
public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int[][] transpose(int[][] a, int r, int c) {
    int[][] result = new int[c][r];
    for (int i = 0; i < c; i++) {
      for (int j = 0; j < r; j++) {
        result[i][j] = a[j][i];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 },
    };
    System.out.println("Original Matrix:");
    printMatrix(matrix);

    matrix = transpose(matrix, 4, 4);

    System.out.println("Transpose Matrix:");
    printMatrix(matrix);
  }
}
