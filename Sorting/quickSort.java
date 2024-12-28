public class quickSort {
    static void displayArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int  partition(int[] arr, int st, int end){
        int pi = arr[st];
        int count = 0;
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pi) count++;
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);
        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pi) {
                i++;
            }
            while (j>pi) {
                j--;
            }
            if (i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
            
        }
        return pivotIdx;
    }
    static void sort(int[] arr, int st, int end){
        if(st >= end) return;

        int pi = partition(arr, st, end);
        sort(arr, st, pi-1);
        sort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {7, 13, 8, 5, 10, 2, 4};
        System.out.println("Array before sorting: ");
        displayArray(arr);
        System.out.println();

        sort(arr, 0, arr.length-1);

        System.out.println("Array after sorting: ");
        displayArray(arr);
    }
    
}
