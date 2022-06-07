public class ControlFlowExercises {
    public static void main(String[] args) {

//        Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

        //2
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}