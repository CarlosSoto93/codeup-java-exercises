package JavaII.Shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShapeR = new Rectangle(4,5);
        Measurable myShapeS = new Square(5);



        System.out.println(myShapeR.getArea());
        System.out.println(myShapeR.getPerimeter());
        System.out.println(myShapeS.getArea());
        System.out.println(myShapeS.getPerimeter());





    }
}
