import java.util.*;

public class totalSumOfMat {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findTotalSum(int[][] mat) {
        if (mat == null || mat.length == 0) {
            System.out.println(0);
            return;
        }
        int n = mat.length;
        int sum = 0;
        // top & bottom row
        for (int i = 0; i < n; i++) {
            sum += mat[0][i];
            sum += mat[n - 1][i];
        }
        // left & right column
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][0];
            sum += mat[i][n - 1];
        }
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][n - 1 - i];
        }
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][i];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix: ");
        printMatrix(matrix);

        // rotate(matrix, r);
        System.out.println("Total Sum: ");
        findTotalSum(matrix);
    }

}
