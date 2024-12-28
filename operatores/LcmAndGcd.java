package operatores;

import java.util.Scanner;

public class LcmAndGcd {
    public static int[] lcmAndGcd(int a, int b) {
        int gcd = 0;
        for(int i = Math.min(a, b); i>=1; i--){
            if(a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }   
        }
        int lcm = (a * b) / gcd;
        return new int[]{lcm, gcd};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int[] result = lcmAndGcd(a, b);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }    
    
}
