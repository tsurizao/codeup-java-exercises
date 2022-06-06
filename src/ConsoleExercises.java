import javax.crypto.spec.PSource;
import java.text.ParseException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        String piStatement = "The value of pi is approximately ";
        System.out.format("%s %.2f%n", piStatement, pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter an integer: ");
        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

        System.out.println("Enter a word: ");
        String firstWord = scanner.next();
        System.out.println("Enter another word: ");
        String secondWord = scanner.next();
        System.out.println("Enter a final word: ");
        String thirdWord = scanner.next();
        System.out.printf("%n%s %n%s %n%s", firstWord, secondWord, thirdWord);
        System.out.println("");


        System.out.println("Enter a sentence: ");
        String mySentence = scanner.nextLine();
        System.out.println(mySentence);

        System.out.println("Calculate the perimeter and area of this room.");
        System.out.println("Enter the length of the room: ");
        float length = scanner.nextFloat();
        System.out.println("Enter the width of the room: ");
        float width = scanner.nextFloat();
        System.out.println("Enter the height of the room: ");
        float height = scanner.nextFloat();
        System.out.println("The perimeter of the room is " + (length * 2 + width * 2));
        System.out.println("The area of the room is " + (length * width));
        System.out.println("The volume of the room is " + (length * width * height));

        System.out.println(Integer.MAX_VALUE);

    }
}
