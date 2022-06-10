package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a double value for the radius of a circle: ");
            Circle circle = new Circle(new Input().getDouble());
            System.out.println("The circle's area is: " + circle.getArea());
            System.out.println("The circle's circumference is: " + circle.getCircumference());
            System.out.println("\nWould you like to continue?");
            boolean response = new Input().yesNo();
            if (!response) {
                System.out.println("Total circles created: " + Circle.getTotalCircles());
                break;
            }
        }
    }
}