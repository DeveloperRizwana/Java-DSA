import java.util.*;

public class secondPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1234;

        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int r = n % 10;

            if (r % 2 == 0) {
                evenSum += r;
            } else {
                oddSum += r;
            }
            n /= 10;
        }
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }

}
