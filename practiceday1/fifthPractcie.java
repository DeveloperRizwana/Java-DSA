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

  public static List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer> result = new ArrayList<>();
    int m = matrix.length, n = matrix[0].length;
    int topRow = 0, bottomRow = m - 1;
    int rightCol = n - 1, leftCol = 0;
    while (topRow <= bottomRow && leftCol <= rightCol) {
    // topRow
    for (int j = leftCol; j <= rightCol; j++) {
      result.add(matrix[topRow][j]);
    }
    topRow++;

    // rightCol-> topRow to bottomRow
    for (int i = topRow; i <= bottomRow; i++) {
      result.add(matrix[i][rightCol]);
    }
    rightCol--;

    // bottomRow -> rightCol to leftCol
    for (int j = rightCol; j >= leftCol; j--) {
      result.add(matrix[bottomRow][j]);
    }
    bottomRow--;

    // leftCol -> bottomRow to topRow
    for (int i = bottomRow; i >= topRow; i--) {
      result.add(matrix[i][leftCol]);
    }
    leftCol++;
  }
    return result;

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
    List<Integer> result = spiralOrder(a);
    System.out.println("Output MAtrix: " + result);
  }
}
