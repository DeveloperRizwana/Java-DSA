import java.util.*;

public class rectangleSum2 {

    static void prefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    static int findRectangleSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        prefixSum(matrix);
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " valuse");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum2 " + findRectangleSum2(matrix, l1, r1, l2, r2));

    }
}
// given a positive integer 'n', generate an " n * n" matrix filled with
// elements from 1 to n in spiral order

// method:2-> pre-caculating the horizontal sum for each row in the matrix