
public class sorted {
   static boolean isSorted(int[] arr, int idx){
    // base case
    if(idx == arr.length - 1) return true;

    //self work
    if(arr[idx] > arr[idx + 1]){
        return false;
    }
    // recursive work
    return isSorted(arr, idx + 1);

   }
    public static void main(String[] args) {
        System.out.println("Array is sorted: ");
        int[] arr = {1,2,3,4,5,6,7};
        if(isSorted(arr, 0)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}
