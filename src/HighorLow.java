import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int value = generator.nextInt(10) + 1; //value is 1 to 10
        int guess = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.println("Guess the number [1-10]: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println(guess + " is not a valid number, please try again");
                }
            } else {
                trash = in.next();
                System.out.println(trash + " is not a valid number!");
                System.out.println("\nPlease enter a number between 1 and 10");
            }
        } while (!done);

        System.out.println("The number was " + value);
        if (guess == value) {
            System.out.println("Good job! You guess the correct number!");
        } else if (guess > value) {
            System.out.println("Your guess was too high");
        } else {
            System.out.println("Your guess was too low");
        }

    }
}