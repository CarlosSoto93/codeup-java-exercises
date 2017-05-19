package JavaII.Shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("Rectangle Method");
        return length * width;
    }

    public double getPerimeter(){
        System.out.println("Rectangle Method");
        return 2 * length + 2 * width;
    }
}
