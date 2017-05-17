package JavaII;


public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        ;

        String promptGetString = "Type a string that i can return.";
        System.out.println(input.getString(promptGetString));

        String promptYesNo = "Type yes or no";
        System.out.println(input.yesNo(promptYesNo));

        String promptGetIntMinMax = "Input an integer between:";
        System.out.println(input.getInt(1, 10, promptGetIntMinMax));

        String promptGetInt = "Input an integer";
        System.out.println(input.getInt(promptGetInt));

        String promptGetDoubleMinMax = "Input a double between:";
        System.out.println(input.getDouble(1.0, 10.0, promptGetDoubleMinMax));

        String promptGetDouble = "Input a double";
        System.out.println(input.getDouble(promptGetDouble));
    }

}
