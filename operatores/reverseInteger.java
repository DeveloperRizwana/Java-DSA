package operatores;
import java.util.Scanner;
public class reverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                // Prevent integer overflow
                return 0;
            }
            reversed = reversed * 10 + digit;
            x = x /10;
        }
        return reversed;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println(result);
    }
}
