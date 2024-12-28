import java.util.*;

public class repeatingNumber {
    static int findRepeatingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Enter Array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeating number: " + findRepeatingNumber(arr));
    }
}
