public class find1stAndLastPosition {
    // static int lowerBound(int[] a, int k){
    //     int st = 0, end = a.length-1, ans = a.length;
    //     while (st <= end) {
    //         int mid = st + (end - st)/2;
    //         if(a[mid] >= k){
    //             ans = mid;
    //             end = mid-1;
    //         } else {
    //             st = mid+1;
    //         }
            
    //     }
    //     return ans;
    // }
    // static int upperBound(int[] a, int k){
    //     int st = 0, end = a.length-1, ans = a.length;
    //     while (st <= end) {
    //         int mid = st + (end - st)/2;
    //         if(a[mid] > k){
    //             ans = mid;
    //             end = mid-1;
    //         } else {
    //             st = mid+1;
    //         }
            
    //     }
    //     return ans;
    // }
    // static int[] searhRange(int[] a, int k){
    //     int n = a.length;
    //     int lb = lowerBound(a, k);
    //     int ub = upperBound(a, k);
    //     if(lb == n || a[lb] != k) return new int[]{-1, -1};
    //     return new int[]{lb, ub - 1};
    // }
    static int firstOccurance(int[] a, int k){
        int st = 0, end = a.length - 1, first = -1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(a[mid] == k){
                first = mid;
                end = mid - 1;
            } else if(a[mid] < k){
                st = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        return first;
    }
    static int lastOccurance(int[] a, int k){
        int st = 0, end = a.length-1, last = -1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(a[mid] == k){
                last = mid;
                st = mid + 1;
            } else if(a[mid] < k){
                st = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        return last;

            
        }
    
    static int[] searhRange(int[] a, int k){
        int first = firstOccurance(a, k);
        if(first == -1) return new int[]{-1, -1};
        int last = lastOccurance(a, k);
        return new int[]{first, last};
    }
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8, 8, 10};
        int k = 8;
        int[] result = searhRange(a, k);
        System.out.println("First: " + result[0]);
        System.out.println("last: " + result[1]);
    }
    
}
