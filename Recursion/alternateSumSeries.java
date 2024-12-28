public class alternateSumSeries {
    static int printAlternateSumSeries(int n){
        if(n == 0){
            return 0;
        }
        int sum = printAlternateSumSeries(n-1);
        if(n % 2 == 0){
        return sum - n;
        }
        return sum + n;
        // return printAlternateSumSeries(n-1) + n;
        
    }
    public static void main(String[] args) {
        System.out.println("Sum: " + printAlternateSumSeries(6));
    }
    
}
