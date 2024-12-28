package practiceday1;

import java.util.*;

public class ninthPractice {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print((char) ('A' + i - j - 1));
            }

            System.out.println();
        }

    }

}
