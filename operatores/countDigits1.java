package operatores;

import java.util.Scanner;

public class countDigits1 {
    static int evenlyDivides(int n) {
        int count = 0;
        int original = n;
        
        while (n > 0) {
            int d = n % 10;
            if(d != 0 && original % d == 0){
                count += 1;
            }
            n =  n / 10;
        }
        return count;

    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int result =  evenlyDivides(n);
        System.out.println("Number of digits that evenly divide " + n + ": " + result);
    }
    
}
