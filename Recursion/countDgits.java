public class countDgits {
    static int printCount(int n){
        if(n >= 0 && n <= 9) return 1;
        int smallAns = printCount(n/10);
        int bigAns = 1; 
        return smallAns + bigAns;
    }
    public static void main(String[] args) {
        System.out.println("Count: " + printCount(748));
    }
    
}
