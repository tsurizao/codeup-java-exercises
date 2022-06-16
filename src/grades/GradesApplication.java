package grades;

import java.util.ArrayList;
import java.util.HashMap;

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

        System.out.println(students.get("tsurizao").getGradeAverage());
        System.out.println(students.get("CruzPR").getGradeAverage());
        System.out.println(students.get("niadanielle14").getGradeAverage());
        System.out.println(students.get("noonchio").getGradeAverage());
    }
}
