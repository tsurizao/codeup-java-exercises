import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        String piStatement = "The value of pi is approximately ";
        System.out.printf("%s %.2f%n", piStatement, pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int nextInt = scanner.nextInt();
//        System.out.println(nextInt);

//        System.out.println("Enter a word: ");
//        String firstWord = scanner.next();
//        System.out.println("Enter another word: ");
//        String secondWord = scanner.next();
//        System.out.println("Enter a final word: ");
//        String thirdWord = scanner.next();
//        System.out.printf("%n%s %n%s %n%s", firstWord, secondWord, thirdWord);

        System.out.println("Enter a sentence: ");
        String mySentence = scanner.next();

        System.out.println(mySentence);
    }
}
