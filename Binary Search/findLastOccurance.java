public class findLastOccurance {
    static int occurance(int[] arr, int st, int end, int k){
        int lo = -1;
        while(st <= end){
            int mid = st + (end -  st)/2;
            if(k == arr[mid]){
                lo = mid;
                st = mid + 1;
            } else if(k < arr[mid]){
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        System.out.println("Last occurance: ");
        int[] arr = {2, 2, 2, 2, 2, 4, 3, 6, 5};
        System.out.println(occurance(arr, 0, arr.length-1, 2));
    }
    
}
