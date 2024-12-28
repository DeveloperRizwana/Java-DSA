public class lowerBound {
    static int search(int[] a, int k){
        int st = 0, end = a.length-1, ans = a.length;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(a[mid] >= k){
                ans = mid;
                end = mid-1;
            } else {
                st = mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int k = 2;
        System.out.println("Result: ");
        System.out.println(search(a, k));
    }
    
}
