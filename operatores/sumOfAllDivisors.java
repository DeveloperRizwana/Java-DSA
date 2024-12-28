package operatores;

import java.util.Scanner;

public class sumOfAllDivisors {
    public static int sumOfAllDivisor(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                if(i%j==0) totalSum += j;
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int result = sumOfAllDivisor(n);
        System.out.println("Sum of all divisors are : " + result);
    }
    
}
