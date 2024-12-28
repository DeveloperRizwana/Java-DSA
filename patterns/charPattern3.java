import java.util.*;

public class charPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + n - i + j - 1));
            }
            System.out.println();
        }
    }

}
// E
// D E
// C D E
// B C D E
// A B C D E