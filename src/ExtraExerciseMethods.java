public class ExtraExerciseMethods {
    public static void main(String[] args) {
        // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
        //  a greeting message to the user by either their first or first and last name.
        System.out.println(sayName("Bob"));
        System.out.println(sayName("Bob", "Barker"));

        // TODO: overload the addition method from the curriculum exercise to both add integers and add doubles
        System.out.println(add(5, 3));
        System.out.println(add(5.55, 3.33));

    }

    public static String sayName(String firstName) {
        return ("Hi, %s" + firstName);
    }

    public static String sayName(String firstName, String lastName) {
        return ("Hi, " + firstName + " " + lastName);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}
