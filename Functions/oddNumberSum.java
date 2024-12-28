package Functions;

import java.util.*;

public class oddNumberSum {
    public static void findOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }

        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        findOddSum(n);

    }

}
