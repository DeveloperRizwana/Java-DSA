public class power {
    // 1st method
    // static int printPower(int p, int q){
    //     if(q == 0) return 1;
    //     int smallAns = printPower(p, q - 1); 
    //     return smallAns * p;
    // }

    // 2nd mehtod
    static int printPower(int p, int q){
        if(q == 0) return 1;
        int smallAns = printPower(p, q/2);
        if(q % 2 == 0){
            return smallAns * smallAns;
        } else {
            return p * smallAns * smallAns;
        }
    }
    public static void main(String[] args) {
        System.out.println("Power: " + printPower(2,5));
    }
    
}
