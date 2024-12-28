public class decreasingSelectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int max_index = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] > arr[max_index]){
                    max_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Decreasing selection sort: "); 
        int[] arr = {2, 4, 3, 8, 7};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
