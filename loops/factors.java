import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 12;
        // int numberOfFactors = 0;

        // for (int i = 1; i <= x; i++) {
        // if (i == 0 || i == x) {
        // continue;
        // }
        // boolean isDivisible = x % i == 0;

        // if (isDivisible == true) {
        // System.out.print(i + " ");
        // numberOfFactors++;
        // }
        // }
        // if (numberOfFactors == 0) {
        // System.out.println(-1);
        boolean found = false; // Start with no factors found

        for (int i = 1; i < x; i++) { // Check numbers from 1 to x-1
            if (x % i == 0) { // If i is a factor of x
                System.out.print(i + " "); // Print the factor
                found = true; // We found at least one factor
            }
        }

        if (!found) { // If no factors were found
            System.out.println(-1); // Print -1
        }
    }

}
