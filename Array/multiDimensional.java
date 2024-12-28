package Array;

import java.util.*;

public class multiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // output
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }
        // System.out.println();

        for (int[] a : arr) { // enhance for loop
            System.out.println(Arrays.toString(a));
        }
    }

}
