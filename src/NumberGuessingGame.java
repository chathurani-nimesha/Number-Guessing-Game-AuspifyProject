import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        boolean playAgain = true;

        System.out.println(" ------------------------------------------------");
        System.out.println("|             NUMBER GUESSING GAME               |");
        System.out.println(" ------------------------------------------------");

        System.out.println("\t Select a number between 1 and 100.");
        System.out.println("\n\t Try to guess it!!!");

        int guess;
        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;

            int attempts = 0;
            guess = 0;
            while (guess != secretNumber) {
                System.out.print("\nEnter your guess: ");

                if (!input.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                    continue;
                }

                guess = input.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("\nCongratulations! You guessed the number!");
                    System.out.println("The correct number was: " + secretNumber);
                    System.out.println("Total attempts: " + attempts);
                }
            }

            System.out.println("\n\n--------------------------------------------");
            System.out.println("             GAME RESULT                   ");

            if (attempts == 1) {
                System.out.println("Excellent! You guessed it on your first try!");
            } else if (attempts <= 5) {
                System.out.println("Great job! You are a good guesser!");
            } else {
                System.out.println("Well played! Keep practicing!");
            }

            System.out.print("Do you want to play again?(Y/N): ");

            String answer = input.next();

            if (answer.equalsIgnoreCase("Y")) {
                playAgain = true;
            } else {
                playAgain = false;
                System.out.println("\n Thank you for playing!");
                System.out.println("Goodbye!!!");
            }
        }
        guess = input.nextInt();

        System.out.println("Your guess is: " + guess);

        input.close();
    }
}