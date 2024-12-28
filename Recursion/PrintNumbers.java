public class PrintNumbers {
    public static void printNos(int n) {
        // Your code here
        if(n == 0) return;
        printNos(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        System.out.println("Result : ");
        int n = 10;
        printNos(n);
        
    }
    
}
