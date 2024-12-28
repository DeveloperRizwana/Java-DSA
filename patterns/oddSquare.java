public class oddSquare {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while (i <= n) {
            int valueToPrint = (2 * i) - 1;
            int maxValue = (2 * n) - 1;

            int j = 1;
            while (j <= n) {
                System.out.print(valueToPrint);
                valueToPrint += 2;
                if (valueToPrint > maxValue) {
                    valueToPrint = 1;
                }
                j += 1;
            }
            System.out.println();
            i += 1;
        }

    }
}
// 1357
// 3571
// 5713
// 7135
