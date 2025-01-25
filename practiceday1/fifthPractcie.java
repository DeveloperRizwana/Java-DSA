import java.util.ArrayList;

public class fifthPractcie {
  static ArrayList<Long> factorialNumbers(long n) {
    ArrayList<Long> result = new ArrayList<>();
    long ans = 1;
    long i = 1;
    while(ans <= n){
        result.add(ans);
        i++;
        ans *= i;
    }
    return result;
  }
  public static void main(String[] args) {
      long n = 9;
      System.out.println("Answer:");
      ArrayList<Long> result = factorialNumbers(n);
      System.out.println(result);
  }
}
