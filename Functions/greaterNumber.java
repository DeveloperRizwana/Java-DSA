package Functions;

import java.util.*;

public class greaterNumber {
    public static int printGreaterNumber(int a, int b) {
        int greater = Math.max(a, b);

        return greater;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = printGreaterNumber(a, b);

        System.out.println("Thge greater number is : " + result);

    }

}
