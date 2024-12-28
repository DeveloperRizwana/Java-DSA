import java.util.*;

public class rotationOfMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findInplaceTranspose(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    static void rotate(int[][] matrix, int n) {
        findInplaceTranspose(matrix, n, n);
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
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
        System.out.println("Input matrix");
        printMatrix(matrix);

        rotate(matrix, r);
        System.out.println("rotation of array");
        printMatrix(matrix);

    }
}
// given a square matrix turn it by 90 degree in a clockwise direction without
// using any extra space
