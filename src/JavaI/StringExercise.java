package JavaI;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

////        1) String basics
//
//        String message = "We don't need no education";
//        System.out.println(message);
//        System.out.println(message.replace("education", "thought control"));
//        System.out.println("");
//
//        System.out.println("Check \"this\" out!, \"s inside of \"s!");
//        System.out.println("In Windows, the main drive is usually C:\\");
//        System.out.println("");
//
//        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!");

////        bonus) Lets Talk to Bob

        String keepTalking = "yes";;
        String userInput;
        System.out.println("Talk to Bob. Say bye when you want to end the conversation");

        do {
            System.out.println("You:");
            userInput = input.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (userInput.trim().isEmpty()) {
                System.out.println("Bob: Fine, be that way!");
            } else if (userInput.endsWith("!") || userInput.toUpperCase().equals(userInput)) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.equalsIgnoreCase("bye")) {
                keepTalking = "no";
            } else {
                System.out.println("Bob: Whatever.");
            }
//            System.out.println("Keep talking? yes/no");
//            keepTalking = input.next();
//            input.nextLine();

        } while (keepTalking.equalsIgnoreCase("yes"));
        System.out.println("Bob:");
        System.out.println("Later");


    }
}
