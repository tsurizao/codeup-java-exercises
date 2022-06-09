import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(5, 3));
        System.out.println("Division: " + divide(5, 3));
        System.out.println("Modulus: " + modulo(5, 3));
        System.out.println("Multiplication: " + multiply(5, 3));
        System.out.println("Multiplication Loop: " + multiplicationLoopA(5, 3));
        System.out.println("Multiplication Loop: " + multiplicationLoopB(5, 3));
        System.out.println("Multiplication Recursion: " + multiplicationRecursion(5, 3));
        numberFactorial(1, 20);
    }

    public static int add(int num, int num2) {
        return num + num2;
    }

    public static int subtract(int num, int num2) {
        return num - num2;
    }

    public static int divide(int num, int num2) {
        return num / num2;
    }

    public static int modulo(int num, int num2) {
        return num % num2;
    }

    public static int multiply(int num, int num2) {
        return num * num2;
    }

    //using loop to calculate product without using *
    public static int multiplicationLoopA(int num, int num2) {
        int initialValue = num;
        for (int i = 1; i < num2; num2--) {
            num += initialValue;
        }
        return num;
    }

    //using loop to calculate product without using *
    public static int multiplicationLoopB(int num, int num2) {
        int product = 0;
        for (int i = 0; i < num2; i++) {
            product += num;
        }
        return product;
    }

    // using recursion to calculate product without using *
    public static int multiplicationRecursion(int num, int num2) {
        return num2 <= 1 ? num : num + multiplicationRecursion(num, num2 - 1);
    }

    // Uses recursion to get a correct response from scanner input
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid number between " + min + " and " + max);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }

    // factorial of a number
    public static void numberFactorial(int min, int max) {
        while (true) {
            int userInput = getInteger(min, max);
            long modifiedInput = 1;
            for (int i = userInput; i > 0; i--) {
                modifiedInput *= i;
            }
            System.out.println(modifiedInput);
            System.out.println("Would you like to continue? (y/n)");
            Scanner sc = new Scanner(System.in);
            String userResponse = sc.next().toLowerCase();
            if(userResponse.equals("n")){
                System.out.println("Exiting Loop!");
                break;
            } else if (userResponse.equals("y")){
                System.out.println("Continuing");
                numberFactorial(min, max);
            }
        }
    }
}
