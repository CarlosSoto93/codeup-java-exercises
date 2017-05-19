package JavaII.Shapes;

abstract class Quadralateral extends Shape implements Measurable {

    protected double length;
    protected double width;


    public Quadralateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    abstract void setLength(double length);

    abstract void setWidth(double width);

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }
}
