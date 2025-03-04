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

    // public static void mul(int[][] a, int[][] b, int r1, int c1, int r2, int c2)
    // {
    // int[][] result = new int[r1][c2];
    // for (int i = 0; i < r1; i++) {
    // for (int j = 0; j < c2; j++) {
    // for (int k = 0; k < c1; k++) {
    // result[i][j] += (a[i][k] * b[k][j]);
    // }
    // }
    // }
    // printMatrix(result);
    // }

    public static void multiply(int A[][], int B[][], int C[][], int N) {
        // add code here.
        int r1 = A.length, c1 = A[0].length;
        int r2 = B.length, c2 = B[0].length;
        if(r2 != c1) return;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }

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
        // mul(a, b, 2, 3, 3, 2);
        multiply(a, b, b, 2);
    }
}
