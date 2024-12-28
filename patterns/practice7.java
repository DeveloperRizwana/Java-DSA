import java.util.*;

public class practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n + 1) / 2;
        int b = n / 2;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = b; i >= 1; i--) {
            for (int j = 1; j <= b - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
