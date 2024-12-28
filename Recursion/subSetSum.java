public class subSetSum {
    static void printSubSetSum(int[] arr, int n, int idx, int curSum){
        if(idx >= n){
            System.out.println(curSum);
            return;
        }
        // include curIndx
        printSubSetSum(arr, n, idx + 1, curSum + arr[idx]);
        // exclude curIdx
        printSubSetSum(arr, n, idx+1, curSum);
    }
    public static void main(String[] args) {
        System.out.println("Sub set sum:");
        int[] arr = {2, 4, 5};
        printSubSetSum(arr, arr.length, 0, 0);
    }
    
}
