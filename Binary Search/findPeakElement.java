public class findPeakElement {
    static int search(int[] a){
        int n = a.length;
        int st = 0, end = n-1;
        while (st <= end) {
            int mid = st + (end - st)/2;
            if((mid == 0 || a[mid] > a[mid-1]) && (mid == n-1 || a[mid] > a[mid+1]) ){
                return mid;
            }
            if(a[mid] < a[mid+1]){
                st = mid+1;
            } else {
                end = mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        System.out.println("Result: ");
        System.out.println(search(a));
    }
    
}
// A peak element is an element that is strictly greater than its neighbors.

// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.