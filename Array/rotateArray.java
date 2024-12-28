import java.util.*;

public class rotateArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Eneter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original array");
        printArray(arr);
        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation");
        printArray(ans);
    }
}
// rotate the given array 'a' by 'k' steps, where k is non-negative
// note: k can be greater than 'n' as well
