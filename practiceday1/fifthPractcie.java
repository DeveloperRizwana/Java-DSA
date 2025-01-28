public class fifthPractcie {
  public static int fib(int n) {
    if(n == 0 || n == 1) return n;
    int a = 0, b = 1;
    int ans = 0;
    for (int i = 1; i < n; i++) {
      System.out.println(a);
       ans = a + b;
      a = b;
      b = ans;
    }
    return a;
  }
  public static void main(String[] args) {
    int n = 3;
    System.out.println(fib(n));
  }
}
