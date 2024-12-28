package operatores;

import java.util.Scanner;

public class palindromeNumber {
    public static boolean isPalindrome(int x) {
            int originalX = x;
            int reverse = 0;
    
            while (x > 0) {
                int lastDigit = x % 10;
                x = x / 10;
                reverse = reverse * 10 + lastDigit;
            }
            // return reverse;
            if(originalX == reverse){
                return true;
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x : ");
            int x = sc.nextInt();
            System.out.println(isPalindrome(x));
        
    }    
    
}
