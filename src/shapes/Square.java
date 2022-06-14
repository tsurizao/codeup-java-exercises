package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int)Math.pow(side, 2);
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }
}
