import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber, guess, attempts = 0;

        secretNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game! Try to guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess");
}
}
}