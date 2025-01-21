public class fifthPractcie {
    static int countDig(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
           for(int j = 1; j<=n; j++){
            if(i%j == 0){
                sum += j;
            }
           }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int a = 4;
        System.out.println("Answer is : " +countDig(a));
    }
}
