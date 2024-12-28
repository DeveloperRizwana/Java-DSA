public class findFirstIndex {
    static int index(int[] input, int x){
        return checkNumber(input, x, 0);
    }
    static int checkNumber(int[] input, int x,int idx){
        if(idx >=  input.length){
            return - 1;
        }
        int result = checkNumber(input, x, idx+1);
        if(input[idx] == x){
            return idx;
        }

        return result;
       
    }
    public static void main(String[] args) {
        System.out.println("First Index: ");
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        System.out.println(checkNumber(arr, 4, 0));
        
    }
    
}
