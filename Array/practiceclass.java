package Array;

import java.util.*;

public class practiceclass {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30 }; // int[] a = new int[3]; ,,,, int [] a=new int[]
        // a[0] = 10;
        // a[1] = 20;
        // a[2] = 30;

        // for (int i = 0; i < a.length; i++) { ,,,,for loop
        // System.out.println(a[i]);
        for (int i : a) { // for each loop

            System.out.print(i + " ,");

        }
    }
}
