import org.w3c.dom.ls.LSOutput;

public class MethodExercises {
    public static void main(String[] args) {
        System.out.println("Addition: " + addition(5, 3));
        System.out.println("Subtraction: " + subtraction(5, 3));
        System.out.println("Division: " + division(5, 3));
        System.out.println("Modulus: " + modulus(5, 3));
        System.out.println("Multiplication: " + multiplication(5, 3));
        System.out.println("Multiplication Loop: " + multiplicationLoop(5, 3));
        System.out.println("Multiplication Recursion: " + multiplicationRecursion(5, 3));
    }

    public static int addition(int num, int num2) {
        return num + num2;
    }

    public static int subtraction(int num, int num2) {
        return num - num2;
    }

    public static int multiplication(int num, int num2) {
        return num * num2;
    }

    public static int division(int num, int num2) {
        return num / num2;
    }

    public static int modulus(int num, int num2) {
        return num % num2;
    }

    //using loop to calculate multiplication without using *
    public static int multiplicationLoop(int num, int num2) {
        int product = 0;
        for (int i = 0; i < num2; i++) {
            product += num;
        }
        return product;
    }

    public static int multiplicationRecursion(int num, int num2) {
        if (num2 <= 1) {
            return num;
        }
        return num + multiplicationRecursion(num, num2 - 1);
    }
}
