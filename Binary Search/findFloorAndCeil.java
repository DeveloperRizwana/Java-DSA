public class findFloorAndCeil {
    static int[] getFloorAndCeil(int[] a, int x){
        // int floor = Integer.MIN_VALUE, ceil = Integer.MAX_VALUE;
        // for(int i = 0; i < a.length; i++){
        //    if(a[i] <= x && floor < a[i]){
        //     floor = a[i];
        //    } 
        //    if(a[i] >= x && ceil > a[i]){
        //     ceil = a[i];
        //    }
        // }
        // if(floor == Integer.MIN_VALUE) {
        //     floor = -1;
        // }
        // if(ceil == Integer.MAX_VALUE){
        //     ceil = -1;
        // }
        // return new int[]{floor, ceil};
        int st = 0, end = a.length-1, floor = -1, ceil = -1;
        while (st <= end) {
           int mid = st + (end - st)/2;
           if(a[mid] == x){
            return new int[]{x, x};
           }
           if(a[mid] < x){
            floor = a[mid];
            st = mid + 1;
           } else {
            ceil = a[mid];
            end = mid - 1;
           }
        }
        return new int[]{floor, ceil};

    }
    public static void main(String[] args) {
        int[] a = {3, 4, 4, 7, 8, 10};
        int x = 8;
        int[] result = getFloorAndCeil(a, x);

        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
    
}
