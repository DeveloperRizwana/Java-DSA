public class raceTrack {
    static boolean isPossible(int[] a, int m, int dist){
        int kidsPlaced = 1;
        int lastKid = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] - lastKid >= dist){
                kidsPlaced++;
                lastKid = a[i];
            }
        }
        return kidsPlaced >= m;
    }

    static int optimalRaceTrack(int[] a, int m){
        if(a.length < m) return -1;
        int ans = -1, st = 0, end = (int)1e9;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(isPossible(a, m, mid)){
                ans = mid;
                st = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 9};
        int m = 2;
        System.out.println("Result: ");
        System.out.println(optimalRaceTrack(a, m));
    }
    
}
