
public class countZeroesRec {
    static int countZeroes(int input){
        if(input == 0){
            return 1;
        }
        if(input < 10) return 0;

        int smallAns = input%10;
        if(smallAns == 0){
            return countZeroes(input/10) + 1;
        } else {
            return countZeroes(input/10) + 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("the number of zeroes: " + countZeroes(102400));
    }
}    



