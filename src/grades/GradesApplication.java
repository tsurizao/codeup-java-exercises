package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student chase = new Student("Chase", new ArrayList<>());
        chase.addGrade(90);
        chase.addGrade(92);
        chase.addGrade(99);

        Student carlos = new Student("Carlos", new ArrayList<>());
        carlos.addGrade(91);
        carlos.addGrade(93);
        carlos.addGrade(97);

        Student nia = new Student("Nia", new ArrayList<>());
        nia.addGrade(98);
        nia.addGrade(95);
        nia.addGrade(91);

        Student alfredo = new Student("Alfredo", new ArrayList<>());
        alfredo.addGrade(94);
        alfredo.addGrade(93);
        alfredo.addGrade(100);

        HashMap<String, Student> students = new HashMap<>();
        students.put("tsurizao", chase);
        students.put("CruzPR", carlos);
        students.put("niadanielle14", nia);
        students.put("noonchio", alfredo);


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        while (true) {
            System.out.println("\nHere are the GitHub usernames of our students:\n");
            // geeksforgeeks.org/how-to-iterate-hashmap-in-java/
            for (Map.Entry<String, Student> set :
                    students.entrySet()) {
                System.out.print("|" + set.getKey() + "|  ");
            }
            System.out.println("\n\nWhat student would you like to see more information on? (Case Sensitive)");
            System.out.print("\n>");
            String userInput = sc.nextLine();
            if (!students.containsKey(userInput)) {
                System.out.println("\nSorry, no student found with the GitHub username of " + userInput);
            } else {
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println(students.get(userInput).getGradeAverage());
            }
            System.out.println("\nWould you like to see another students?");
            System.out.print("\n>");
            userInput = sc.nextLine();
            if ((!userInput.equalsIgnoreCase("y")) && (!userInput.equalsIgnoreCase("yes"))) {
                System.out.println("\nGoodbye, and have a wonderful day!");
                break;
            }
        }
    }
}
