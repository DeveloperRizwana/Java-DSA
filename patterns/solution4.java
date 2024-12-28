import java.util.*;

public class solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + i - 1);
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9