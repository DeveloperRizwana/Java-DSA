public class searchInMatrix {
    // treat the 2d matrix as a 1d sorted array
    static boolean search(int[][] a, int k){
        int n = a.length, m = a[0].length;
        int st = 0, end = n * m - 1;
        while (st <= end) {
            int mid = st + (end - st)/2 ;
            int midElt = a[mid/m][mid%m];
            if(midElt == k) return true;
            if(midElt < k){
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    static boolean search1(int[][] a, int k){
        int n = a.length, m = a[0].length;
        int i = 0, j = m-1;
        while(i < n && j >= 0){
            if(a[i][j] == k) return true;
            if(a[i][j] > k){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.err.println("Result: ");
        // int[][] a = {
        //     {1, 3, 5, 7},
        //     {10, 11, 16, 20},
        //     {23, 30, 34, 60},
        // };
        // System.err.println(search(a, 2));
        int[][] a = {
            {2, 4, 6},
            {5, 6, 7},
            {7, 11, 13},
            {12, 14, 17},
        };
        System.out.println(search1(a, 11));
    }
}
