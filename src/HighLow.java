import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }

    public static void highLow() {
        int secretNumber = (int) Math.floor(Math.random() * (100) + 1);
        Scanner sc = new Scanner(System.in);
        int numberOfTries = 0;
        System.out.println("I'm thinking of a number from 1 and 100.\nCan you guess what it is?\nI'll give you 10 tries.");
        while (true) {
            int userGuess = sc.nextInt();
            numberOfTries++;
            if (secretNumber == userGuess) {
                System.out.println("GOOD GUESS! It took you " + numberOfTries + " of tries!");
                break;
            } else if (userGuess > secretNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
            if (numberOfTries > 9) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
}
