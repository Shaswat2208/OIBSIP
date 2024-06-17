import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        final int MAX_ATTEMPTS = 10;
        int round = 1;
        int totalScore = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (true) {
            System.out.println("\nRound " + round + " - Let's begin!");
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + MAX_ATTEMPTS + "): ");
                int guess = scanner.nextInt();
                scanner.nextLine();

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    int score = MAX_ATTEMPTS - attempts;
                    totalScore += score;
                    System.out.println("Your score for this round: " + score);
                    guessedCorrectly = true;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("The number is higher.");
                } else {
                    System.out.println("The number is lower.");
                }

                attempts++;
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }

            round++;
        }

        System.out.println("\nGame Over!");
        System.out.println("Total score: " + totalScore);
        scanner.close();
    }
}
