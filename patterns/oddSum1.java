import java.util.*;

public class oddSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(j);
                } else {
                    System.out.print(j + "+");
                }
                sum = sum + j;
            }
            System.out.print("=" + sum);
            System.out.println();
        }
    }
}
