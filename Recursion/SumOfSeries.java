public class SumOfSeries {
    public static int sumOfSeries(int n) {
        // code here
        if(n == 0) return 0;

        int smallAns = sumOfSeries(n-1);
        return smallAns + n*n*n;
    }
    public static void main(String[] args) {
        System.err.println("Result : ");
        int n = 7;
        System.out.println(sumOfSeries(n));
    }
}
