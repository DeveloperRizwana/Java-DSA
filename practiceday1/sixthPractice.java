public class sixthPractice {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + n - i + j - 1));
            }
            System.out.println();
        }
    }

}
