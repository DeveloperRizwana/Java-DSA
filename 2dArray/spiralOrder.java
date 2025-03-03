import java.util.*;
public class spiralOrder {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix) {
        int r = matrix.length;
        if(r == 0){
            return;
        }
        int c = matrix[0].length;
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            // bottomRow -> rightCol tp leftCol
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
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

        // rotate(matrix, r);
        System.out.println("Spiral order");
        printSpiralOrder(matrix);
    }
}
// given an "n * m" matrix 'a' return all elements of the matrix in spiral order
