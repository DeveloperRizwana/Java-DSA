import java.util.*;

public class frequencyArray {

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;
        }
        return freq;
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
        int[] freq = makeFrequencyArray(arr);
        System.out.println("Enter number of queries ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter number to be searched ");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");

            }
            q--;
        }
    }
}
// given q queries , checks if the given number is present in the array or not
// note : value of all the elements in the array is less than 10 the power 5.
