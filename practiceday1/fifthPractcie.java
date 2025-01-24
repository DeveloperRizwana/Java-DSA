public class fifthPractcie {
    public static int sumOfSeries(int n) {
      if(n == 1) return 1;
      return sumOfSeries(n-1) + n*n*n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Answer:");
        System.out.println(sumOfSeries(n));
    }
}
