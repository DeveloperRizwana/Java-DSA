
public class charPattern6 {
    public static void main(String[] args) {
        // int n = 4;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print((char) ('A' + j - 1));
        // }

        // for (int j = 1; j <= i; j++) {
        // System.out.print((char) ('A' + j - 1));

        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + j - 1);
        // }

        // for (int j = 2; j <= i; j++) {
        // System.out.print(2 * i - j);
        // }
        // System.out.println();
        // }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print((char) ('A' + i - j - 1));
            }
            System.out.println();
        }
    }

}
