import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
//        System.out.println("Addition: " + add(5, 3));
//        System.out.println("Subtraction: " + subtract(5, 3));
//        System.out.println("Division: " + divide(5, 3));
//        System.out.println("Modulus: " + modulo(5, 3));
//        System.out.println("Multiplication: " + multiply(5, 3));
//        System.out.println("Multiplication Loop: " + multiplicationLoopA(5, 3));
//        System.out.println("Multiplication Loop: " + multiplicationLoopB(5, 3));
//        System.out.println("Multiplication Recursion: " + multiplicationRecursion(5, 3));
//        numberFactorial(1, 20); // calls getInteger method to verify proper integers being used
        diceRoll();
    }

    //1
    //Create basic calculation methods
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

    //(bonus exercise) using loop to calculate product without using *
    public static int multiplicationLoopA(int num, int num2) {
        int initialValue = num;
        for (int i = 1; i < num2; num2--) {
            num += initialValue;
        }
        return num;
    }

    //(bonus exercise) using loop to calculate product without using *
    public static int multiplicationLoopB(int num, int num2) {
        int product = 0;
        for (int i = 0; i < num2; i++) {
            product += num;
        }
        return product;
    }

    //(bonus exercise) using recursion to calculate product without using *
    public static int multiplicationRecursion(int num, int num2) {
        return num2 <= 1 ? num : num + multiplicationRecursion(num, num2 - 1);
    }

    //2
    //Uses recursion to get a correct response from scanner input
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

    //3
    // Calculate the factorial of a number
    // Used previous method to verify integer meets criteria
    public static void numberFactorial(int min, int max) {
        while (true) {
            int userInput = getInteger(min, max);
            long factorialProduct = 1;
            for (int i = userInput; i > 0; i--) {
                factorialProduct *= i;
            }
            System.out.println(factorialProduct);
            System.out.println("Would you like to continue? (y/n)");
            Scanner sc = new Scanner(System.in);
            String userResponse = sc.next().toLowerCase();
            if (userResponse.equals("n")) {
                System.out.println("Exiting Loop!");
                break;
            } else if (userResponse.equals("y")) {
                numberFactorial(min, max);
            }
        }
    }

    //4
    // Simulate a pair of dice rolling
    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's roll some dice!");
        System.out.println("Enter the number of sides for a pair of dice.");
        int numberOfSides = sc.nextInt();
        while (true) {
            System.out.println("Type 'roll' to roll your dice.");
            String roll = sc.next().toLowerCase();
            if (roll.equals("roll")) {
                while (true) {
                    System.out.println("Die 1: " + ((int) Math.floor(Math.random() * (numberOfSides)) + 1));
                    System.out.println("Die 2: " + ((int) Math.floor(Math.random() * (numberOfSides)) + 1));
                    System.out.println("Would you like to roll again? (y/n)");
                    String again = sc.next().toLowerCase();
                    if (again.equals("n")) {
                        break;
                    }
                }
            } else {
                continue;
            }
            System.out.println("Thanks for playing!");
            break;
        }
    }
}
