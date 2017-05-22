package JavaII.Shapes;

public class Rectangle extends Quadralateral implements Measurable {

    public Rectangle(double length, double width){
        super(length, width);
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    public double getArea() {
        return super.getArea();
    }
}
