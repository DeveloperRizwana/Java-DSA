public class distributeChocolate {
    static boolean isDivisionPossible(int[] a, int m, int mxChocAllowed){
        int numberOfStudent = 1;
        int choc = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > mxChocAllowed) return false;
            if(choc + a[i] <= mxChocAllowed){
                choc += a[i];
            } else {
                numberOfStudent++;
                choc = a[i];
            }
        }
        return numberOfStudent <= m;
        // if(numberOfStudent > m) return false;
        // return true;
    }
    static int distribute(int[] a, int m){
        if(a.length < m) return -1;
        int ans = 0, st = 1, end = (int)1e9;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(isDivisionPossible(a, m, mid)){
                ans = mid;
                end = mid - 1;
            } else {
                st = mid +1;
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        int[] a = {12, 34, 67, 90};
        int m = 2;
        System.out.println("Result: ");
        System.out.println(distribute(a, m));
    }
}
