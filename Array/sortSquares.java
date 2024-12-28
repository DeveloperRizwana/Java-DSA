import java.util.*;

public class sortSquares {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] findSortSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) < Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            System.out.println("original array");
            printArray(arr);
            int[] ans = findSortSquares(arr);
            System.out.println("Sorted Array");
            reverse(ans);
            printArray(ans);
        }

    }

}
