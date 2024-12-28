package operatores;

import java.util.*;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numberOfDigits = 0;
        int original_num = n;

        while (n > 0) {
            numberOfDigits += (n % 10);
            n = n / 10;

        }
        System.out.println("Sum of digits in " + original_num + " = " + numberOfDigits);
    }
}
