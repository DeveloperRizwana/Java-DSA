public class PrintGfg {
    public static void printGfg(int n){
        if(n == 0) return;

        printGfg(n-1);
        System.out.print("Rizu" + " ");
    }
    public static void main(String[] args) {
        System.out.println("Rresult : ");
        int n = 10;
        printGfg(n);
    }
}
