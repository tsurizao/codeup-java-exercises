package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student joe = new Student("Joe", new ArrayList<>());
        joe.addGrade(89);
        joe.addGrade(92);
        joe.addGrade(97);
        joe.addGrade(90);
        System.out.println(joe.getGradeAverage());
    }
}
