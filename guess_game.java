
import java.util.Random;
import java.util.Scanner;

class GuessMyNumber {
    public static void main(String[] args) {
        // Initialize the Scanner for user input and Random for generating random numbers
        Scanner scan  = new Scanner(System.in);
        Random rand = new Random();

        // Generate a random number between 1 and 10
        int guessNo = rand.nextInt(10) + 1;
        int no_of_trials = 5;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess My Number Game!");
        System.out.println("I have randomly selected a number between 1 and 100.");
        System.out.println("You have " + no_of_trials + " attempts to guess the correct number. Good luck!");

        for (int i = 1; i <= no_of_trials; i++) {
            System.out.print("This is " + i +  "Attempt: Enter your guess: ");
            int userGuess = scan.nextInt();

            if (userGuess < guessNo) {
                System.out.println("Too low! Try a larger number.");
            } else if (userGuess > guessNo) {
                System.out.println("Too high! Try a smaller number.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + guessNo);
                hasGuessedCorrectly = true;
                break;
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry! Your attempt limit is up. The correct number was: Try again by restarting the game" + guessNo);
        }

        scan.close();
    }
}
