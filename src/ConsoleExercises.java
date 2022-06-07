import javax.crypto.spec.PSource;
import java.text.ParseException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //1.1
        double pi = 3.14159;
        String piStatement = "The value of pi is approximately ";
        System.out.format("%s %.2f%n", piStatement, pi);

        //2.1
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter an integer: ");
        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

        //2.2
        System.out.println("Enter a word: ");
        String firstWord = scanner.next();
        System.out.println("Enter another word: ");
        String secondWord = scanner.next();
        System.out.println("Enter a final word: ");
        String thirdWord = scanner.next();
        System.out.printf("%n%s %n%s %n%s", firstWord, secondWord, thirdWord);
        System.out.println("");

        //2.3 & 2.4
        System.out.println("Enter a sentence: ");
        String mySentence = scanner.next();
        System.out.println(mySentence);

        //3.1
        System.out.println("Calculate the perimeter and area of this room.");
        System.out.println("Enter the length of the room: ");
        int length = scanner.nextInt();
        System.out.println("Enter the width of the room: ");
        int width = scanner.nextInt();
        System.out.println("Enter the height of the room: ");
        int height = scanner.nextInt();

        //3.2
        System.out.println("The perimeter of the room is " + (length * 2 + width * 2));
        System.out.println("The area of the room is " + (length * width));
        System.out.println("The volume of the room is " + (length * width * height));

        System.out.println(Integer.MAX_VALUE);

    }
}
