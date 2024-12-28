public class nthRoot {
    // return 1 if == m 
    // return 2 if < m
    // return 0 if > m 
    static int power(int n, int mid, int m){
        long result = 1;
        for(int i = 1; i <= n; i++){
            result *= mid;
            if(result > m) return 2;
        }
        if(result == m){
            return 1;
        }
        return 0;
    }
   
    static int root(int n, int m){
        int st = 1, end = m;
        while (st<=end) {
            int mid = st + (end - st)/2;
            int k = power(n, mid, m);
            if(k == 1) return mid;
            else if(k == 0) st = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3, m = 27;
        System.out.println("Result: ");
        System.out.println(root(n, m));
    }
    
}
