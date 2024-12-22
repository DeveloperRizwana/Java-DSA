package operatores;

import java.util.Scanner;

public class isArmastrongNumber {
   
    public static boolean armstrongNumber(int n){
        int sum = 0;
        int originalN = n;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n/10;
            int cube = lastDigit*lastDigit*lastDigit;
            sum += cube;
        }
    //    return originalN == sum;
        if (originalN == sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        boolean result = armstrongNumber(n);
        // if(result){
        //     System.out.println(n + " is an Armstrong number");
        // } else{
        //     System.out.println(n + " is not an Armstrong number");
            
        // }
        System.out.println(result);
    }
}
