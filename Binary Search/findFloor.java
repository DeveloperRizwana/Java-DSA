public class findFloor {
    static int floorValue(int[] a, int k){
        int st = 0, end = a.length-1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(a[mid] == k) return mid;
            if(a[mid] < k) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        return ans;
        // int st = 0, end = a.length-1;
        // int ans = a.length;
        // while (st <= end) {
        //     int mid = st + (end - st)/2;
        //     if(a[mid] >= k) {
        //         ans = mid;
        //         end = mid - 1;
        //     } else {
        //         st = mid + 1;
        //     }
            
        // }
        // return ans;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 8, 10, 11, 12, 19};
        int k = 5;
        System.out.println("Result: ");
        System.out.println(floorValue(a, k));
    }
    
}
