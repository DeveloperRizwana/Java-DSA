package Functions;

import java.util.*;

public class integerCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printTheUserInput(numberOfinputs);
    }

    public static void printTheUserInput(int numberOfInputs) {
        // printTheuserInput();
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroes = 0;
        while (i <= numberOfInputs) {
            System.out.print("Enter your input: ");
            int input = sc.nextInt();
            if (input < 0) {
                negativeNumbers++;
            } else if (input > 0) {
                positiveNumbers++;
            } else {
                zeroes++;
            }
            i++;
        }

        System.out.println("Positive: " + positiveNumbers);
        System.out.println("negative : " + negativeNumbers);
        System.out.println("Zeroes : " + zeroes);
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // printTheUserIntputs(n);
}

// int positiveNumbers = 0;
// int negativeNumbers = 0;
// int zeroes = 0;
