public class countSort1 {
    static void displayArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        // make prefix sum array of count array 
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }
        // find the index of each element in the original array and put it in output array
        for(int i = n-1; i >= 0; i--){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy of all elements to output array
        for(int i = 0; i < n ; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        System.out.println("Sosrted array: ");
        int[] arr = {1, 4, 5, 2, 2, 5};
        countSort(arr);
        displayArray(arr);
    }
    
}
