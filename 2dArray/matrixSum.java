import java.util.*;

public class matrixSum {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input-addition not possible ");
            return;
        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of rows and columns of matrix1");
        // int r1 = sc.nextInt();
        // int c1 = sc.nextInt();
        // int[][] a = new int[r1][c1];
        // System.out.println("Enter matrix1 values ");
        // for (int i = 0; i < r1; i++) {
        //     for (int j = 0; j < c1; j++) {
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Enter number of rows and columns of matrix2");
        // int r2 = sc.nextInt();
        // int c2 = sc.nextInt();
        // int[][] b = new int[r2][c2];
        // System.out.println("Enter matrix2 values ");
        // for (int i = 0; i < r2; i++) {
        //     for (int j = 0; j < c2; j++) {
        //         b[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Enter matrix1");
        // printMatrix(a);
        // System.out.println("Enter matrix2");
        // printMatrix(b);
        int[][] matrix1 = {
            {1,2,3},
            {4,5,6,},
            {7,8,9},
        };

        int[][] matrix2 = {
            {1,2,3},
            {4,5,6,},
            {7,8,9},
        };
        System.out.println("Sum of matrix1 and matrix2 ");
        add(matrix1, 3, 3, matrix2, 3, 3);
    }
}
