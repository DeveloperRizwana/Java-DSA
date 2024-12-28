import java.util.*;

public class practic3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i - j) + 1);
            }

            System.out.println();
        }
    }

}
// 1
// 21
// 321
// 4321
// 54321