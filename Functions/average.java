package Functions;

import java.util.*;

public class average {
    public static int findAverage(int a, int b, int c) {
        int average = (a + b + c) / 2;
        return average;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = findAverage(a, b, c);
        System.out.println("Average of 3 numbers is : " + average);

    }

}
