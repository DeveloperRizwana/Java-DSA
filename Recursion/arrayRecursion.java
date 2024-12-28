public class arrayRecursion {
    static void printArray(int[] arr, int idx){

        // base case
        if(idx == arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]);
        // recursive work
        printArray(arr, idx+1);

    }
    static int maxInArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int smallAns = maxInArray(arr, idx + 1);
        return Math.max(arr[idx], smallAns);

    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 6};
        // printArray(arr, 0);
        System.out.println(maxInArray(arr, 0));
    }
    
}
