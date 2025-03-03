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
        int largeRow = 0;
        int largeColumn = 0;
        int rowNumber = 0;
        int columnNumber = 0;


        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < column; j++) {
                rowSum += matrix[i][j];
            }
            if (largeRow < rowSum) {
                largeRow = rowSum;
                rowNumber = i;
            }
        }

        for (int j = 0; j < column; j++) {
            int columnSum = 0;
            for (int i = 0; i < row; i++) {
                columnSum += matrix[i][j];
            }
            if (largeColumn < columnSum) {
                largeColumn = columnSum;
                columnNumber = j;
            }
        }
        if (largeColumn > largeRow) {
            System.out.println("column " + columnNumber + " " + largeColumn);
        } else {
            System.out.println("row " + rowNumber + " " + largeRow);
        }
	
    }
    public static void main(String[] args) {
        // System.out.println("Enter rows and columns of matrix: ");
        // Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // int[][] matrix = new int[r][c];
        // int totalElements = r * c;

        // System.out.println("Enter " + totalElements + " values: ");
        // for(int i = 0; i < r; i++){
        //     for(int j = 0; j < c; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        int[][] matrix = {
            {1,2,3},
            {4,5,6,},
            {7,8,9},
        };
        System.out.println("Matrix: ");
        printMatrix(matrix);

        System.out.println("Largest Row/column sum: ");
        rowSum(matrix);
    }
    
}
