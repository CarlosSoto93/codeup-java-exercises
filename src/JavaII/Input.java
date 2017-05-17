package JavaII;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String string = scanner.nextLine();
        return string;
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String message = scanner.next();
        switch (message) {
            case "y":
                return true;
            case "Y":
                return true;
            case "yes":
                return true;
            case "Yes":
                return true;
            default:
                return false;
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        System.out.println(min + " and " + max);
        int inputNumber = scanner.nextInt();
        if (min <= inputNumber && inputNumber <= max) {
            return inputNumber;
        }
        System.out.println("Invalid integer");
        return getInt(min, max, prompt);
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        System.out.println(min + " and " + max);
        double inputNumber = scanner.nextDouble();
        if (min <= inputNumber && inputNumber <= max) {
            return inputNumber;
        }
        System.out.println("Invalid double");
        return getDouble(min, max, prompt);
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double inputNumber = scanner.nextDouble();
        return inputNumber;
    }


}
