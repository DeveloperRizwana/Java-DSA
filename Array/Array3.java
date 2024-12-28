package Array;

import java.util.*;

public class Array3 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 23, 9, 18 };
        System.out.println(Max(arr));
    }

    static int Max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
