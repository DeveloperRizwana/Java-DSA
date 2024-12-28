package operatores;

import java.util.*;

public class raisePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 1;
        int ans = 1;
        while (i <= b) {
            ans = ans * a;

            i++;
        }
        System.out.println(ans);

    }

}
