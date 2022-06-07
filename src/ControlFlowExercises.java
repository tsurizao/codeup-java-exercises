import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

        //4
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a numerical grade value from 0 to 100");
        int userGrade = s.nextInt();
        System.out.println("Would you like to see your letter grade?  Please enter 'Yes' or 'No'");
        String userContinue = s.next().toLowerCase();
        if (userContinue.equals("yes")) {
            if (userGrade > 97){
                System.out.println("Your grade is an A+");
            } else if (userGrade > 93) {
                System.out.println("Your grade is an A");
            } else if (userGrade > 89) {
                System.out.println("Your grade is an A-");
            } else if (userGrade > 87) {
                System.out.println("Your grade is a B+");
            } else if (userGrade > 83) {
                System.out.println("Your grade is a B");
            } else if (userGrade > 79) {
                System.out.println("Your grade is a B-");
            } else if (userGrade > 77) {
                System.out.println("Your grade is a C+");
            } else if (userGrade > 73) {
                System.out.println("Your grade is a C");
            } else if (userGrade > 69) {
                System.out.println("Your grade is a C-");
            } else if (userGrade > 67) {
                System.out.println("Your grade is a D+");
            } else if (userGrade > 63) {
                System.out.println("Your grade is a D");
            } else if (userGrade > 59) {
                System.out.println("Your grade is a D-");
            } else {
                System.out.println("Your grade is an F");
            }
        } else {
            System.out.println("No problem, have a good day!");
        }
    }
}