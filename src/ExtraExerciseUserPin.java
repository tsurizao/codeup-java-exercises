import java.util.Scanner;
public class ExtraExerciseUserPin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int correctPin = 12345;
        int numberOfAttempts = 0;
        while(true){
            if(numberOfAttempts >= 3){
                System.out.println("You've reached the max number of attempts, please try again later.");
                break;
            }
            System.out.println("Please enter pin:");
            int enteredPin = s.nextInt();
            if(correctPin == enteredPin){
                System.out.println("Correct, welcome back!");
                break;
            } else {
                numberOfAttempts++;
                System.out.println("Incorrect pin, try again.");
            }
        }
    }
}
