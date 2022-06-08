import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //3

        Scanner s = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userInput = s.nextInt();
        int i = 0;
        String userResponse = "";
        System.out.println("number | squared | cubed\n-------|---------|-------");
        do {
            i++;
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
            if (i == userInput) {
                System.out.println("Would you like to continue?");
                userResponse = s.next().toLowerCase();
                if (userResponse.equals("no")) {
                    System.out.println("Exiting Loop.");
                    break;
                }
            }
        } while (i <= 99);
    }
}