package JavaII;


public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.getString("Type a string that i can return."));

        System.out.println(input.yesNo("Type yes or no"));

        System.out.println(input.getInt("Input an integer between:", 1, 10));

        System.out.println(input.getInt("Input an integer"));

        System.out.println(input.getDouble("Input a double between: ", 1.0, 10.0));

        System.out.println(input.getDouble("Input a double"));
    }

}
