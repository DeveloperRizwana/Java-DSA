import java.util.*;

public class triangleOfNumbera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + j - 1);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(2 * i - j);
            }
            System.out.println();
        }

    }

}
