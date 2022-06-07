import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

        //3
        Scanner s = new Scanner(System.in);

//      Initial values to allow program to run properly
        int userInput = 0;
        String userResponse = "";

        // Asks for input, and forms the upper part of table
        while (userInput < 1 || userInput > 100) {
            System.out.println("Choose a number between 1 and 100?");
            userInput = s.nextInt();
        }
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("-------|---------|-------");
        System.out.println("1      |1        |1      ");

        // Outputs input into table like format
        for (int i = 2; i <= 100; i++) {
            // Asks user if they would like to continue with the rest of the table once their input was satisfied
            if (i > userInput) {
                System.out.println("Would you like to continue? Enter 'Yes' or 'No'");
                userResponse = s.next().toLowerCase();
            }
            // Exits loop if uses wishes to stop
            if (userResponse.equals("no")) {
                System.out.println("Loop exited");
                break;
            }
            // Continues through the rest of the loop if user wishes to continue
            if (userResponse.equals("yes")) {
                userInput = 100;
            }
            int squared = i * i;
            int cubed = i * i * i;
            String iSpaces = "      |";
            String squaredSpaces = "        |";

            // changes spaces depending on number of digits in i
            if (i > 9 & i <= 99) {
                iSpaces = "     |";
            } else if (i > 99) {
                iSpaces = "    |";
            }
            // changes spaces depending on number of digits in squared integer
            if (squared > 9 && squared <= 99) {
                squaredSpaces = "       |";
            } else if (squared > 99 && squared <= 999) {
                squaredSpaces = "      |";
            } else if (squared > 999 && squared <= 9999) {
                squaredSpaces = "     |";
            } else if (squared > 9999) {
                squaredSpaces = "    |";
            }
            System.out.println(i + iSpaces + squared + squaredSpaces + cubed);
        }
    }

}