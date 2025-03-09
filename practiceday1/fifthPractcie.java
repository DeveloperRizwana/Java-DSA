
public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void transpose(int[][] matrix) {
    int n = matrix.length, m = matrix[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = i+1; j < n; j++) {

        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[][] a = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
    };
    System.out.println("Input MAtrix");
    printMatrix(a);

    // int[][]result = transpose(a);

    System.out.println("Output MAtrix: ");
    transpose(a);
    printMatrix(a);
  }
}
