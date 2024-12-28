
import java.util.*;

public class reverse {

    // public static void main(String[] args) {
    // int[] arr = { 1, 3, 45, 67, 98 };
    // reverse(arr);
    // System.out.println(Arrays.toString(arr));
    // }

    // static void reverse(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start < end) {
    // swap(arr, start, end);
    // start++;
    // end--;
    // }
    // }

    // static void swap(int[] arr, int index1, int index2) {
    // int temp = arr[index1];
    // arr[index1] = arr[index2];
    // arr[index2] = temp;
    // }

    // }

    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = reverseArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");

        }
    }

}
