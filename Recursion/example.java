public class example {
    public static void main(String[] args) {
        int n = 5;
        int f = 0, s = 1;
        System.out.println("Series: ");
        for(int i = 0; i < n; i++){
            System.out.println(f);

            int temp = f + s;
            f = s;
            s = temp;
        }
        
    }
    
}
