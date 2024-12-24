import java.util.ArrayList;
import java.util.*;

public class factorialNumbers {
     static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        long k = 1, factorial =1;
        while (factorial <= n) {
            result.add(factorial);
            k++;
            factorial *= k;
        }
        return result;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long n = sc.nextInt();
        System.out.println(factorialNumbers(n));
        
    }
    
}
