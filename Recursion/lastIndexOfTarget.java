
public class lastIndexOfTarget {
    static int findLastIndexOfTarget(int[] arr, int target, int idx){
        // base case
        if(idx >= arr.length) return -1;

        int smallAns = findLastIndexOfTarget(arr, target, idx + 1);
        if(smallAns != -1){
            return smallAns;
        }
        if(arr[idx] == target){
            return idx;
        }
        return -1;
        

    }
    public static void main(String[] args) {
        System.out.println("Last index: ");
        int[] arr = {4, 2, 3, 4, 4};
        System.out.println(findLastIndexOfTarget(arr, 4, 0)); 
    }
   
    
    
}
