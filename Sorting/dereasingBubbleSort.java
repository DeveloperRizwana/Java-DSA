public class dereasingBubbleSort {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            boolean flag = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Decreasing bubble sort: ");
        int[] arr = {1, 2, 6, 3, 4, 8, 7};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
            
        }
    }
}
