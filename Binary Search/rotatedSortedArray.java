public class rotatedSortedArray {
    static int search(int[] a, int st, int end, int k){
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(a[mid] == k){
                return mid;
            } else if(a[mid] < a[end]){
                if(k > a[mid] && k <= a[end]){
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(k >= a[st] && k < a[mid]){
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    //duplicate elements
    static int search1(int[] a, int st, int end, int k){
        while (st <= end) {
            int mid = st + (end - st)/2;
            if(a[mid] == k){
                return mid;
            } 
            else if(a[st] == a[mid] && a[end] == a[mid]){
                st++;
                end--;
            }
            else if(a[mid] <= a[end]){
                if(k > a[mid] && k <= a[end]){
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(k >= a[st] && k < a[mid]){
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 2, 3, 1, 2, 2, 2, 1};
        System.out.println("Result: ");
        // System.out.println(search(a, 0, a.length-1, 91));
        System.out.println(search1(a, 0, a.length-1, 2));
    }

}
// Given the rotated sorted array of integers, which contains distinct elements, and an integer target, return the index of target if it is in the array. otherwise return -1
