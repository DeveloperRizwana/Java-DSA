import java.util.*;

public class pairSum {
    

    static int findPairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum: ");
        int target = sc.nextInt();

        int result = findPairSum(arr, target);
        System.out.println(result);

    }
}

    

