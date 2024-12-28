import java.util.*;

public class rectangleSum3 {
    static void prefixSum(int[][] matrix, int r, int c) {
        // traverse horizontally to calculate prefixSum row-wise
        for (int i = 0; i < r; i++) { // fix row
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        // traverse vertically to calculate prefixSum column-wise
        for (int j = 0; j < c; j++) { // fix column
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, upleft = 0, left = 0;
        int r = matrix.length;
        int c = matrix[0].length;
        prefixSum(matrix, r, c);

        sum = matrix[l2][r2];
        if (l1 >= 1) {
            up = matrix[l1 - 1][r2];
        }
        if (r1 >= 1) {
            left = matrix[l2][r1 - 1];
        }
        if (l1 >= 1 && r1 >= 1) {
            upleft = matrix[l1 - 1][r1 - 1];
        }
        ans = sum - up - left + upleft;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " valuse");
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

        System.out.println("Rectangle sum " + findSum3(matrix, l1, r1, l2, r2));
    }
}
// method:3-> prefix sum over columns and rows both
