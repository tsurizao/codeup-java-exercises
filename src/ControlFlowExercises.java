public class ControlFlowExercises {
    public static void main(String[] args) {

//        Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

        //1
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int num = 4;
        do {
            System.out.println(num);
//            num *= num; // causes an issue when starting value is 2 or 4
            num = (int) Math.pow(num, 2);
        } while (num < 1000000);
    }
}
