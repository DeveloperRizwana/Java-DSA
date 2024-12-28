import java.util.Scanner;

public class printOneToN {
    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
// write a program to print all natural numbers from 1 to n using recursion
    

