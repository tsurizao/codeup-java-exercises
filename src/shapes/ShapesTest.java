package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Original test
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        // New test with abstract classes that extend Quadrilateral and implement Measurable
        Measurable mySquareShape = new Square(5);
        System.out.println(mySquareShape.getArea());
        System.out.println(mySquareShape.getPerimeter());

        Measurable myRectangleShape = new Rectangle(4, 5);
        System.out.println(myRectangleShape.getArea());
        System.out.println(myRectangleShape.getPerimeter());

//        mySquareShape.getLength();
//        myRectangleShape.getLength();

        // 9.
        // It's implementing methods from Measureable, therefor requiring the class to
        // either be abstract itself or to include the methods defined in Measurable

        //10.
        // The getLength and getWidth calls do not work properly because they no longer exist.
    }
}
