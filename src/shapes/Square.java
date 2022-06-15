package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        return super.length * 4;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public void setLength() {
    }

    public void setWidth() {
    }
}