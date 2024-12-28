import java.util.*;

public class equalSumPartition {

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];

        }
        return totalSum;
    }

    static boolean findEqualSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int sufixSum = totalSum - prefSum;
            if (sufixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the zise of array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter " + n + " elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition sum : " + findEqualSumPartition(arr));
    }

}
// check if we can partition array into two subarrays with equal sum. more
// formally, check that the prefix sum of a part of the array is equal to the
// suffix sum of rest of the array
