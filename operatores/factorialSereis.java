package operatores;
import java.util.*;
public class factorialSereis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        // int i = 1;
        int factorial = 1;
        // while (i <= n) {
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

            // i++;
            System.out.println("Factorial of " + i + ": " + factorial);
        }

    }

}
