package JavaII.Shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side){
        super (side, side);
        this.side = side;
    }

    public double getArea(){
        System.out.println("Square method");
        return Math.pow(side, 2);
    }

    public double getPerimeter(){
        System.out.println("Square method");
        return 4 * side;
    }
}
