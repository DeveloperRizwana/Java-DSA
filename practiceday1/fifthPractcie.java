public class fifthPractcie {
    public static int[] lcmAndGcd(int a, int b) {
        int gcd = 0;
        for(int i = b; i>=1; i--){
            if(a%i==0 && b%i==0){
                gcd = i;
                break;
            }
        }
        int lcm = (a*b)/gcd;
        return new int[]{lcm,gcd};
    }
    public static void main(String[] args) {
       int a = 5, b = 10;
       int[] result = lcmAndGcd(a, b);
       System.out.println(result[0] + " " + result[1]);
    }
}
