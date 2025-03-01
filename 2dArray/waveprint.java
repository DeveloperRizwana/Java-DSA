import java.util.Scanner;
public class waveprint {
    static void printMatrix(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
    static void makeWavePrint(int[][] mat){
        int r = mat.length;
        if(r == 0){
            return;
        }
        int c = mat[0].length;
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0) {
                // Even-indexed column: top to bottom
                for (int i = 0; i < r; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                // Odd-indexed column: bottom to top
                for (int i = r - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }    
    }
    public static void main(String[] args) {
        System.out.println("Enter rows and columns of Matrix: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Wave print of matrix: ");
        makeWavePrint(mat);
    }
    
}
