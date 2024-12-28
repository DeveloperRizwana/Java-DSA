public class findAllIndices {
    static void printAllIndices(int[] arr, int target, int idx){
        if(idx >= arr.length){
            return;
        } 
        if(arr[idx] == target){
            System.out.println(idx);
        }
        printAllIndices(arr, target, idx + 1);
    }
    public static void main(String[] args) {
        System.out.println("All indices: ");
        int[] arr = {1, 2, 2, 4, 2};
        printAllIndices(arr, 2, 0);
    }
    
}
    // static int[] index(int[] input, int x){
    //     return allIndices(input, x, 0);

    // }
    // static int[] allIndices(int[] input, int x, int idx){
    //     if(idx == input.length){
    //         return new int[0];
    //     }
    //     int[] result = allIndices(input, x, idx+1);
    //     if(input[idx] == x){
    //         int[] ans = new int[result.length+1];
    //         ans[0] = idx;
    //         for(int i = 1; i < ans.length; i++){
    //             ans[i] = result[i-1];
    //         }
    //         return ans;

    //     }
    //     return result;

    // }
    // public static void main(String[] args) {
    //     System.out.println("all Indices: ");
    //     int[] arr = {2, 1, 1, 3, 4};
    //     int[] result = index(arr, 1);
    //     System.out.println(Arrays.toString(result));
    // }
    

