import java.util.*;

public class charPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
    }

}
// ABCD
// ABC
// AB
// A