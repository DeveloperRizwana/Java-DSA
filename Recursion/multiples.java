import java.util.*;
public class multiples {
    static void printMultiples(int n, int k){
        if(k == 0){
            // System.out.println(k);
            return;
        }
        // if(k == 1){
        //     System.out.println(n);
        //     return;
        // }
        printMultiples(n, k - 1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        System.out.println("Enter n and k: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMultiples(n,k);
    }
    
}
