public class multiplicationOfXandY {
    static int multiplication(int x, int y){
        if(y == 0){
            return 0;
        }
        int smallAns = multiplication(x, y - 1);
        return x + smallAns;

    }
    public static void main(String[] args) {
        System.out.println("Multiplication: " + multiplication(10, 20));
    }
    
}
