package Array;

import java.util.*;

public class array1 {
    public static void main(String[] args) {
        // (1)
        // for primitive types
        // int[] a = new int[5];
        // a[0] = 11;
        // a[1] = 12;
        // a[2] = 13;
        // a[3] = 14;
        // a[4] = 15;

        // System.out.println(Arrays.toString(a));

        // (2)
        // array of objects
        // Scanner sc = new Scanner(System.in);
        // String[] s = { "a", "b", "c", "d" };
        String[] s = new String[4];
        s[0] = "a";
        s[1] = "n";
        s[2] = "c";
        s[3] = "f";
        // for (int i = 0; i < s.length; i++) {
        // s[i] = sc.next();
        // }
        System.out.println(Arrays.toString(s));

    }
}
