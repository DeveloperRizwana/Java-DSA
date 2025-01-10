import java.util.*;

public class practiceclass2 {
    public static void main(String[] args) {
        // int[][] a = { { 10, 20, 30 }, { 40, 50, 60 } }; // MATRIX ARRAY
        int[][] a = new int[2][3];
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;

        a[1][0] = 40;
        a[1][1] = 50;
        a[1][2] = 60;

        // int[][] a = new int[2][]; //JAGGED ARRAY
        // a[0] = new int[4];
        // a[1] = new int[3];

        // a[0][1] = 20;
        // a[1][2] = 50;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.err.println();
        }

    }
}