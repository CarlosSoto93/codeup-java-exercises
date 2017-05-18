package JavaII;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String message = scanner.next();
        if (message.equalsIgnoreCase("y") || message.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt + " " + min + " - " + max);
        int inputNumber = scanner.nextInt();
        if (min <= inputNumber && inputNumber <= max) {
            return inputNumber;
        }
        System.out.println("Invalid");
        return getInt(prompt, min, max);
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();

    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt + " " + min + " - " + max);
        double inputNumber = scanner.nextDouble();
        if (min <= inputNumber && inputNumber <= max) {
            return inputNumber;
        }
        System.out.println("Invalid");
        return getDouble(prompt, min, max);
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }


}
