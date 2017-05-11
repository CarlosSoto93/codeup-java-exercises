package Exercises;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1) String basics

        String message = "We don't need no education";
        System.out.println(message);
        System.out.println(message.replace("education", "thought control"));

        System.out.println("Check \"this\" out!, \"s inside of \"s!");
        System.out.println("In Windows, the main drive is usually C:\\");

        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!");


////        bonus)

//        String keepTalking = "yes";
//        String userInput;
//
//        while (keepTalking.equalsIgnoreCase("yes")) {
//            System.out.println("Talk to Bob.");
//            userInput = input.nextLine();
//            if (userInput.endsWith("?")) {
//                System.out.println("Bob: Sure");
//            } else if (userInput.trim().equals("")) {
//                System.out.println("Bob: Fine, be that way!");
//            } else if (userInput.toUpperCase().equals(userInput)) {
//                System.out.println("Bob: Whoa, chill out!");
//            } else {
//                System.out.println("Bob: Whatever.");
//            }
//            System.out.println("Keep talking? yes/no");
//            keepTalking = input.next();
//            input.nextLine();
//
//        }


    }
}
