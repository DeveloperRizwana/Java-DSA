import java.util.*;
public class largestRowOrColumnSum {
    static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rowSum(int[][] matrix){
        // int r = matrix.length;
        //  int c = matrix[0].length;
        // int max = Integer.MIN_VALUE;
        // int idx = -1;
        // boolean isRow = true;

        // for(int i = 0; i < r; i++){
        //     int ans = 0;
        //     for(int j = 0; j < c; j++){
        //         ans += matrix[i][j];
        //     }
        //     if(ans > max){
        //         max = ans;
        //         idx = i;
        //         isRow = true;
        //     }

        // }
        // for(int j = 0; j < c; j++){
        //     int sum = 0;
        //     for(int i = 0; i < r; i++){
        //         sum += matrix[i][j];
        //     }
        //     if(sum > max){
        //         max = sum;
        //         idx = j;
        //         isRow = false;
        //     }
        // }
        // if(isRow){
        //     System.out.println("Row " + idx + " has the largest sum: " + max);
        // } else {
        //     System.out.println("Column " + idx + " has the largest sum: " + max);
        // }
        int row = matrix.length;
        if(row == 0){
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }
        int column = matrix[0].length;
        int largerow = 0;
        int largecolumn = 0;
        int rownumber = 0;
        int columnnumber = 0;


        for (int i = 0; i < row; i++) {
            int rowsum = 0;
            for (int j = 0; j < column; j++) {
                rowsum += matrix[i][j];
            }
            if (largerow < rowsum) {
                largerow = rowsum;
                rownumber = i;
            }
        }

        for (int j = 0; j < column; j++) {
            int columnsum = 0;
            for (int i = 0; i < row; i++) {
                columnsum += matrix[i][j];
            }
            if (largecolumn < columnsum) {
                largecolumn = columnsum;
                columnnumber = j;
            }
        }
        if (largecolumn > largerow) {
            System.out.println("column " + columnnumber + " " + largecolumn);
        } else {
            System.out.println("row " + rownumber + " " + largerow);
        }
	
    }
    public static void main(String[] args) {
        System.out.println("Enter rows and columns of matrix: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        printMatrix(matrix);

        System.out.println("Largest Row/column sum: ");
        rowSum(matrix);
    }
    
}
