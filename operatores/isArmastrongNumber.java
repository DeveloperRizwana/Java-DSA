package operatores;

import java.util.Scanner;

import Strings.length;

public class isArmastrongNumber {
    static int countDig(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static boolean armstrongNumber(int n){
        int numberOfDig = String.valueOf(n).length();
        // int numberOfDig = countDig(n);
        int sum = 0;
        int originalN = n;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n/10;
            double pow = Math.pow(lastDigit, numberOfDig);
            sum += pow;
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
        if(result){
            System.out.println(n + " is an Armstrong number");
        } else{
            System.out.println(n + " is not an Armstrong number");
            
        }
        // System.out.println(result);
    }
}
