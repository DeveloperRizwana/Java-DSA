import java.util.*;

public class loops4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int product = 0;(1)

        // for (int i = 1; i <= 10; i++) {
        // product = n * i;
        // System.out.println(product);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
            // int i = 1; (2)
            // while (i <= 10) {
            // System.out.println(i * n);
            // i += 1; // i = i + 1; ,,,,, i++
        }
    }

}
// print the table