public class Factorial {
    static int factorial(int n){
        // base case
        if(n == 0) return 1;

        // smaller problem - recursive work
        // int samllAns = factorial(n - 1);

        return n * factorial(n - 1); 
        // big problem - self work
        // int ans = n * samllAns;
        // return ans;
    }
    public static void main(String[] args) {
        System.out.println("factorial " + factorial(4));
    }
    
}
