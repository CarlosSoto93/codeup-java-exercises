package JavaII;

public class Circle {
    private double radius;
    private static int numberOfCircles = 0;

    public Circle(double radius){
        numberOfCircles++;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

}
