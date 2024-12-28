
import java.util.*;

public class thirdPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println(-1);
        }

    }

}
