import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random=new Random();

        int secretNumber=random.nextInt(100)+1;

        System.out.println(" ------------------------------------------------");
        System.out.println("|             NUMBER GUESSING GAME               |");
        System.out.println(" ------------------------------------------------");

        System.out.println("\t Select a number between 1 and 100.");
        System.out.println("\n\t Try to guess it!!!");

        input.close();
    }
}