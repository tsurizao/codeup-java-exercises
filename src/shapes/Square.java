package shapes;

public class Square extends Rectangle {


    public Square(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }
}
