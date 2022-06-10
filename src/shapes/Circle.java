package shapes;

public class Circle {
    private double radius;

    private static int totalCircles;

    public Circle(){
        totalCircles++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }

    public double getCircumference(){
        return (this.radius * 2 * Math.PI);
    }
    public static int getTotalCircles(){
        return totalCircles;
    }

    public static void setTotalCircles(int totalCircles){
        Circle.totalCircles = totalCircles;
    }
}