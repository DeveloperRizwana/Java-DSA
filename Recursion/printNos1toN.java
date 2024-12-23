public class printNos1toN {
    public static void printNos(int N){
        if(N == 0) return;

        System.out.print(N + " ");
        printNos(N-1);
    }
    public static void main(String[] args) {
        System.out.println("Result :");
        int N = 10;
        printNos(N);
    }
    
}
