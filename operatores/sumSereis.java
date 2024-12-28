package operatores;

import java.util.*;

public class sumSereis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        int ans = 0;
        // for (int i = 1; i <= n; i++) {
        while (i <= n) {
            if (i % 2 == 0) {
                ans -= i;
            } else {
                ans += i;

            }
            i++;
        }
        System.out.println(ans);

    }

}
