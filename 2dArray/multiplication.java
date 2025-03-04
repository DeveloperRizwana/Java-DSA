public class multiplication {
    public static void printMatrix(int[][] a) {
        int n = a.length, m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mul(int[][] a, int[][] b, int r1, int c1, int r2, int c2) {
        if (r2 != c1)
            return;
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        printMatrix(result);
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 1 },
                { 3, 1, 2 },
        };

        int[][] b = {
                { 1, 2 },
                { 3, 1 },
                { 1, 1 },
        };
        System.out.println("Input MAtrix1");
        printMatrix(a);

        System.out.println("Input MAtrix2");
        printMatrix(b);

        System.out.println("multiplication of matrix1 and matrix2 ");
        mul(a, b, 2, 3, 3, 2);
    }
}
