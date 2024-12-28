package operatores;

import java.util.*;

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int output = 0;
        for (int i = 1; i * i <= n; i++) {
            output = i;
            // while (output * output <= n) {
            // output += 1;
            // }
            // output -= 1;
        }
        System.out.println(output);
        // double m = Math.sqrt(n);
        // System.out.println("Square root of " + n + " is : " + m);

    }

}
