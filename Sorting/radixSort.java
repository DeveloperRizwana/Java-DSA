public class radixSort {
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < arr.length; i++){
            count[(arr[i]/place)%10]++;
        }
        // make prefix sum array of count array 
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }
            for(int i = n-1; i >= 0; i--){
            int idx = count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[( arr[i]/place)%10]--;
        }
        // copy of all elements to output array
        for(int i = 0; i < n ; i++){
            arr[i] = output[i];
        }
    }
    static void radixSorting(int[] arr){
        int max = findMax(arr);
        // apply count sort to sort elements based on place value
        for(int place = 1; max/place > 0; place *= 10){
            countSort(arr, place);
        }
    }
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 2};
        radixSorting(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
            
        }
        System.out.println();
    }   
    
}   
