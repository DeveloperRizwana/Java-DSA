public class firstOccurance {
    static int search(int[] arr, int st, int end, int k){
        int fo = -1;
        while (st <= end) {
            int mid = st + (end-st)/2;
            if(k == arr[mid]){
                fo = mid;
                end = mid - 1;
            } else if (k < arr[mid]) {
                end = mid - 1;
                
            } else {
                st = mid + 1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        System.out.println("First occurance: ");
        int[] arr = {2, 5, 5, 5, 6, 6, 8};
        System.err.println(search(arr, 0, arr.length-1, 12));

    }
}

