import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1, guess;
        System.out.println("Guess the number (1-100):");
        do {
            guess = sc.nextInt();
            if (guess < number)
                System.out.println("Too low!");
            else if (guess > number)
                System.out.println("Too high!");
        } while (guess != number);
        System.out.println("Correct! The number was " + number);
        sc.close();
    }
}
