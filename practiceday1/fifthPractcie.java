public class fifthPractcie {
    static int evenlyDivides(int n) {
        int reversed = 0;
        while (n != 0) {
            int d = n % 10;
            n = n / 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                // Prevent integer overflow
                return 0;
            }
            reversed = reversed * 10 + d;
        }
        return reversed;
    }
    public static void main(String[] args) {
       int n = -123;
       System.out.println(evenlyDivides(n));
    }
}
