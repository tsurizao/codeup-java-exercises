public class ExtraExerciseMethods {
    public static void main(String[] args) {
        System.out.println(sayName("Bob"));
        System.out.println(sayName("Bob", "Barker"));
    }

    public static String sayName(String firstName) {
        return ("Hi, %s" + firstName);
    }

    public static String sayName(String firstName, String lastName) {
        return ("Hi, " + firstName + " " + lastName);
    }
}
