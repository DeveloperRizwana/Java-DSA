public class sumOfNDigits {
    static int printSum(int n){
        if(n >= 0 && n <= 9) return n;
        return printSum(n/10) + n%10;
        // if(n >= 0 && n <= 9){
        //    return n;
        // }
        // int smallAns = printSum(n/10);
        // int bigAns = n%10;
        // return smallAns + bigAns;
    }
    public static void main(String[] args) {
        System.out.println("Sum: " + printSum(1234));
    }
}
