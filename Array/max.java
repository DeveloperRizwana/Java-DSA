package Array;

import java.util.*;

public class max {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 45, 67, 98 };
        System.out.println(max(arr));
    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
