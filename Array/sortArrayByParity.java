import java.util.*;

public class sortArrayByParity {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void findsortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter size of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        findsortArrayByParity(arr);
        System.out.println("Sorted Array ");
        printArray(arr);
    }
}
// given an array of integer 'a' move all the integers at the beginning of the
// array followed by the odd integers . The relative order of odd or even array
// that satisfies the condition
