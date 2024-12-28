public class countSort {
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
    static void basicCountSort(int[] arr){
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k++] = i;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Sosrted array: ");
        int[] arr = {1, 4, 5, 2, 2, 5};
        basicCountSort(arr);
        displayArray(arr);
    }
}    

