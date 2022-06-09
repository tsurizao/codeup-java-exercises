import org.w3c.dom.ls.LSOutput;

public class MethodExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 3));
        System.out.println(subtraction(5, 3));
        System.out.println(multiplication(5, 3));
        System.out.println(division(5, 3));
        System.out.println(modulus(5, 3));
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
}
