package operatores;

import java.util.*;

public class countOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        int original_num = n;

        while (n > 0) {

            n = n / 10;
            i++;
        }
        System.out.println("the number of digits in " + original_num + " = " + i);

    }

}
