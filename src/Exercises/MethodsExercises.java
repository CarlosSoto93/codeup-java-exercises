package Exercises;

import java.util.Scanner;

public class MethodsExercises {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
////        for 1)
//        int x = 5;
//        int y = 0;
//
//        System.out.println(addition(x, y));
//        System.out.println(subtraction(x, y));
//        System.out.println(multiplication(x, y));
//        if (y != 0) {
//            System.out.println(division(x, y));
//        } else {
//            System.out.println("You can not divide by 0");
//        }
//        if (y != 0) {
//            System.out.println(modulus(x, y));
//        } else {
//            System.out.println("You can not modulus by 0");
//        }

////        for 2)
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);

//        for 3)
        String anotherFactorial = "yes";
        do {
            if (anotherFactorial.equalsIgnoreCase("yes")) {
                System.out.println("Factorial = " + calculateFactorial());
            }
            System.out.println("Calculate another Factorial? yes/no");
            anotherFactorial = input.next();
        } while (anotherFactorial.equalsIgnoreCase("yes"));

    }


////       for 1)
//    public static int addition(int inputOne, int inputTwo) {
//        int answer = inputOne + inputTwo;
//        return answer;
//    }
//
//    public static int subtraction(int inputOne, int inputTwo) {
//        int answer = inputOne - inputTwo;
//        return answer;
//    }
//
//    public static int multiplication(int inputOne, int inputTwo) {
//        int answer = inputOne * inputTwo;
//        return answer;
//    }
//
//    public static int division(int inputOne, int inputTwo) {
//        int answer = inputOne / inputTwo;
//        return answer;
//    }
//
//    public static int modulus(int inputOne, int inputTwo) {
//        int answer = inputOne % inputTwo;
//        return answer;
//    }

////    for 2)
//    public static int getInteger(int min, int max) {
//        System.out.println("(Integer Range)");
//        System.out.println("Enter a number between 1 and 10: ");
//        int usersNumber = input.nextInt();
//        if (min <= usersNumber && usersNumber <= max) {
//            return usersNumber;
//        } else {
//            System.out.println("not valid");
//            return getInteger(min, max);
//        }
//    }


////    for 3)
    public static long calculateFactorial() {
        System.out.println("(Calculate Factors)");
        System.out.println("Enter a number between 1 and 10.");
        int userNumber = input.nextInt();
        long factorial = 1;
            if (1 <= userNumber && userNumber <= 10) {
                for (int i = 1; i <= userNumber; i++) {
                    factorial *= i;
                }
            } else {
                System.out.println("Not a valid number");
                return calculateFactorial();
            }
            return factorial;
    }

}
