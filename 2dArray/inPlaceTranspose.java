import java.util.*;

public class inPlaceTranspose {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // only for square matrix
    static void findInplaceTranspose(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter rows and columns of matrix");
        // int r = sc.nextInt();
        // int c = sc.nextInt();

        // int[][] matrix = new int[r][c];
        // int totalElements = r * c;
        // System.out.println("Enter " + totalElements + " values");
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        int[][] matrix = {
            {1,2,3},
            {4,5,6,},
            {7,8,9},
        };
        System.out.println("Input matrix");
        printMatrix(matrix);
        System.out.println("Transposed matrix");
        findInplaceTranspose(matrix, 3, 3);
        printMatrix(matrix);

    }
}
