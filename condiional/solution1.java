import java.util.*;

public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;    
        int i = 0;
        while(i <= n) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println(sum);
    }
}            

