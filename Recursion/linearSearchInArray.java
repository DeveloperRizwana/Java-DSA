public class linearSearchInArray {
    // return index of target if target present in Array, otherwise return - 1
    static int printLinearSearchInArray1(int[] arr, int target, int idx){
        // base case
        if(idx == arr.length - 1){
            return -1;
        }
        // self work
        if(arr[idx] == target){
            return idx;
        }
        // recursive work
        return printLinearSearchInArray1(arr, target, idx + 1);
        
    }
    // true/false -> based on existence
    static boolean printLinearSearchInArray(int[] arr, int target, int idx){
        // base case
        if(idx == arr.length){
            return false;
        }
        boolean smallAns = printLinearSearchInArray(arr, target, idx + 1);
        // self work 
        if(arr[idx] == target){
            return true;
        }
        // recursive work
        return  smallAns;
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8, 6};
        System.out.println("Linear Search 1: " +  printLinearSearchInArray(arr, 14, 0));
        System.out.println("Linear Search 2: " +  printLinearSearchInArray1(arr, 14, 0));
    }
    
}
    
// static boolean checkNumber(int[] arr, int x){
//     if(arr.length == 0){
//         return false;
//     }
//     if(arr[0] == x){
//         return true;
//     }     
//     int[] smallAns = new int[arr.length-1];
//     for(int i = 1; i < arr.length; i++){
//         smallAns[i-1] = arr[i];

//     }
    
//     return checkNumber(smallAns, x);
// }
// public static void main(String[] args) {
    
//     int[] arr = {2, 13, 4, 1, 3, 6, 28};
//     System.out.println(checkNumber(arr, 3));
    
// }

