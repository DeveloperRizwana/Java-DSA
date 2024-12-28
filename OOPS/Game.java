import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumber;  // Random number to be guessed
    private int noOfGuesses;   // Number of guesses taken by the user

    // Constructor to generate a random number between 1 and 100
    public Game() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1;  // Random number between 1 and 100
        this.noOfGuesses = 0;  // Initialize guesses count to 0
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Method to take user input (guess)
    public int takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();
        return guess;
    }

    // Method to check if the guessed number is correct
    public boolean isCorrectNumber(int guess) {
        if (guess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
            return true;
        } else if(guess < randomNumber){
            System.out.println("You have entered a number smaller than the guessed number, please enter a greater number");
            return false;
        } else {
            System.out.println("You have entered a number greater than the guessed number, please enter a smaller number");
            return false;
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        Game game = new Game();
        boolean correct = false;

        // Loop until the user guesses the correct number
        while (!correct) {
            int userGuess = game.takeUserInput();
            game.setNoOfGuesses(game.getNoOfGuesses() + 1);  // Increment guess count
            correct = game.isCorrectNumber(userGuess);
        }

        // After the game ends, print the total number of guesses
        System.out.println("You guessed the correct number in " + game.getNoOfGuesses() + " attempts!");
    }
}
