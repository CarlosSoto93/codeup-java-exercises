package JavaII;

/**
 * Created by Carlos on 5/17/17.
 */
public class Circle {
    private double radius;
    private static int numberOfCircles = 0;

    public Circle(double radius){
        numberOfCircles++;
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

}
