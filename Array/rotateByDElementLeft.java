import java.util.*;
public class rotateByDElementLeft {


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void findRotateInPlace(int[] arr, int d) {
        int n = arr.length;
        int k = n - d - 1;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k);
        reverse(arr, k + 1, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter d");
        int d = sc.nextInt();

        System.out.println("Original array");
        printArray(arr);
        findRotateInPlace(arr, d);
        // System.out.println("Array after rotation");
        // printArray(arr);
        
    }
}
//you have been given a random integer array/list(ARR) of size N.
// Write a function that rotates the given array/list by D elements(towards the left).

// Note:
//Change in the input array/list itself.You don't need to return or print the elements.
    

