public class rootSquare {
    // static int square(int x){
    //     int y = 0;
    //     while (y*y <= x) {
    //         y++;
    //     }
    //     return y - 1;
    // }
    // public static void main(String[] args) {
    //     System.out.println("Sqaure root: ");
    //     int x = 100;
    //     System.out.println(square(x));
    // }
    static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1; 
        while (st <= end) {
            int mid = st+(end-st)/2;
            int target = mid*mid;
            if(target == x){
                return mid;
            } else if(target < x){
                ans = mid;
                st = mid+1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Sqaure root: ");
        int x = 25;
        System.out.println(sqrt(x));
    }
}
