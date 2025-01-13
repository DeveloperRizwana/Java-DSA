import java.util.*;
public class smallestLargestElement {
    static void findSmallestLargestElement(int[] arr) {
        Arrays.sort(arr); // Sort the array

        // Print the smallest and largest elements
        System.out.println("Smallest element: " + arr[0]); // First element after sorting
        System.out.println("Largest element: " + arr[arr.length - 1]); // Last element after sorting
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }
        findSmallestLargestElement(arr); // Call the method to find smallest and largest elements
    }
}
