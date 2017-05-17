package JavaII;

/**
 * Created by Carlos on 5/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Circle circle;
        Input input = new Input();
        boolean anotherCircle = true;

        do {
            String promptForDouble = "What is the radius of the circle?";
            Double inputRadius = input.getDouble(promptForDouble);

            circle = new Circle(inputRadius);

            System.out.println(circle.getCircumference());
            System.out.println(circle.getArea());

            String promptAnotherCircle = "Would you like the circumference and area of another circle?";
            anotherCircle = input.yesNo(promptAnotherCircle);

        } while (anotherCircle == true);

        System.out.println("Number of Circles created: " + circle.getNumberOfCircles());

    }
}
