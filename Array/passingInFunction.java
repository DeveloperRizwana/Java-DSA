package Array;

import java.util.*;

public class passingInFunction {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }

}
