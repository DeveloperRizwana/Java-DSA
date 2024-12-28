public class solution {
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
    int[] ans = new int[n];
    int[] count = new int[10];
    for(int i = 0; i < arr.length; i++){
        count[(arr[i]/place)%10]++;

    }
    for(int i = 1; i < count.length; i++){
        count[i] += count[i-1];
    }
    for(int i = n-1; i >= 0; i--){
        int idx = count[(arr[i]/place)%10]-1;
        ans[idx] = arr[i];
        count[(arr[i]/place)%10]--;
    }
    for(int i = 0; i < arr.length; i++){
        arr[i] = ans[i];
    }

   }
   static void radixSort(int[] arr){
    int max = findMax(arr);
    for(int place = 1; max/place > 0; place *= 10){
        countSort(arr, place);
    }
   }
   public static void main(String[] args) {
    int[] arr  ={170, 4, 45, 30, 120};
    radixSort(arr);
    System.out.println("Sorted array: ");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
   }
    
}
