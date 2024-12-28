import java.util.*;
public class Gcd {
    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    static int lcm(int x, int y){
        return (x * y) / gcd(x, y);
    }
    static int igcd(int x, int y){
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println("Enter x and y: ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(igcd(x, y));
        System.out.println(gcd(x, y));
        System.out.println(lcm(x, y));
    }
    
}

    

