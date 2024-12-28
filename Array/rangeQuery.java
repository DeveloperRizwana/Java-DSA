import java.util.*;

public class rangeQuery {

    static int[] makePrefixSumArray(int[] arr) {
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
        int[] arr = new int[n + 1];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Original Array ");
        // printArray(arr);

        int[] pref = makePrefixSumArray(arr);
        System.out.println("Enter number of queries ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter range ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l - 1];
            System.out.println("Sum: " + ans);
        }

    }
}
// gievn an array of integer of size n..Answer 'q' queries where you need to
// print the sum of values in a given range of indices from '1' to 'r' (both
// included)
// Note: the values of '1' ans 'r' in queries follow 1-based indexing
