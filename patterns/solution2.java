import java.util.*;

public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n - j + 1);
            }
            System.out.println();
        }
    }

}
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1