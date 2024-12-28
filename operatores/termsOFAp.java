package operatores;

import java.util.*;

public class termsOFAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int ans = 3 * i + 2;
            if (ans % 4 != 0) {
                System.out.print(ans + " ");
            } else {
                n++;
            }
        }
    }

}
