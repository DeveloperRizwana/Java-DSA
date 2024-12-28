import java.util.*;
public class isSorted {
    static boolean findisSorted(int[] nums) {
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] < nums[i - 1]) {
        //         return false;
        //     }
        // }
        // return true;

        int break_count = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                break_count++;
            }
        }
        if(nums[nums.length-1] > nums[0]){
            break_count++;
        }
        return break_count <= 1;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter " + n + " element: ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Sorted: " + findisSorted(arr));
        int[] a = {3, 4, 5, 1, 2, 6};
            System.out.println(findisSorted(a));
    }
}
