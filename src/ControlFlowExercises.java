public class ControlFlowExercises {
    public static void main(String[] args) {

//        Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

        //1

        //A
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        //B
        for (int i = 6; i < 1000000; i = (int) Math.pow(i, 2)) {
            System.out.println(i);
        }
    }
}
