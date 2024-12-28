import java.util.*;

public class rowWiseSum {
    static void printMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findRowWiseSum(int[][] arr){
        int r = arr.length;
       
        for(int i = 0; i < r; i++){
            int ans = 0;
            int c = arr[i].length;
            for(int j = 0; j < c; j++){
                ans += arr[i][j];
            }
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        printMatrix(arr);
        System.out.println("Row wise sum: ");
        findRowWiseSum(arr);
       
    }
}
