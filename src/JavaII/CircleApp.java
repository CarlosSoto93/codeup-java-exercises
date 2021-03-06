package JavaII;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle;
        Input entry = new Input();
        boolean anotherCircle = true;
        do {
            double inputRadius = entry.getDouble("What is the radius of your circle?");

            circle = new Circle(inputRadius);

            System.out.println(circle.getCircumference());
            System.out.println(circle.getArea());

            anotherCircle = entry.yesNo("Would you like the circumference and area of another circle?");

        } while (anotherCircle == true);

        System.out.println("Number of Circles created: " + circle.getNumberOfCircles());

    }
}
