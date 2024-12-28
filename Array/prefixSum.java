import java.util.Scanner.*;

public class prefixSum {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // static int[] makePrefixSumAray(int[] arr) {
    // int n = arr.length;
    // int[] pref = new int[n];
    // pref[0] = arr[0];

    // for (int i = 1; i < n; i++) {
    // pref[i] = pref[i - 1] + arr[i];
    // }
    // return pref;

    // }
    // in place array
    static int[] makePrefixSumAray(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println("Enter the zise of array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array ");
        printArray(arr);

        int[] pref = makePrefixSumAray(arr);
        printArray(pref);

    }
}
// given an array 'a' return the prefix sum/running sum in the same array
// without creating a new array
