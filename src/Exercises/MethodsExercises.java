package Exercises;

import java.util.Scanner;

public class MethodsExercises {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
////        for 1)
//        int x = 45;
//        int y = 12;
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


////        for 3)
//        String anotherFactorial = "y";
//        do {
//            if (anotherFactorial.equalsIgnoreCase("y")) {
//                System.out.println("(Calculate Factors)");
//                System.out.println("Enter a number between 1 and 65.");
//                int userNumber = input.nextInt();
//                System.out.println("Factorial = " + calculateFactorial(userNumber));
//            }
//            System.out.println("Calculate another Factorial? y/n");
//            anotherFactorial = input.next();
//        } while (anotherFactorial.equalsIgnoreCase("y"));


////        for 4)
//        System.out.println("Enter the number of side on your dice.");
//        int diceSides = input.nextInt();
//
//        System.out.println("Do you want to roll your dice? y/n");
//        String roll = input.next();
//
//        if (roll.equalsIgnoreCase("y")) {
//            do {
//                System.out.println(diceRolls(diceSides));
//                System.out.println("Do you want to roll dice again? y/n");
//                roll = input.next();
//            } while (roll.equalsIgnoreCase("y"));
//        }


////        for 5)
        System.out.println("Lets play Higher Lower. y/n");
        int gameNumber = (int) (Math.random() * 100 + 1);
        String wantToPlay = input.next();
        if (wantToPlay.equalsIgnoreCase("y")) {
            int userGuess = 0;
            int guessesLeft = 3;
            do {
                System.out.println("Whats your guess? " + guessesLeft + " guesses left");
                userGuess = input.nextInt();
                System.out.println(playHigherLower(gameNumber, userGuess, guessesLeft));
                guessesLeft--;
                if (guessesLeft == 0) {
                    userGuess = gameNumber;
                }


            } while (userGuess != gameNumber);
            System.out.println("The number was " + gameNumber);
        }


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
//        ////answer with recursion
//        if (inputTwo == 1) {
//            return inputOne;
//        } else {
//        return inputOne + multiplication(inputOne, inputTwo - 1);
//        }
//
//        //answer with a loop
//        int answer = 0;
//        for (int i = 1; i <= inputTwo; i++) {
//            answer += inputOne;
//        }
//        return answer;
//
//        //answer with *
//        int answer = inputOne * inputTwo;
//        return answer;
//    }

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
//    public static long calculateFactorial(int userNumber) {
//        long factorial = userNumber;
//        if (1 <= userNumber && userNumber <= 65) {
//            ////Finding Factorial with recursion
//            if (userNumber == 1) {
//                return factorial *= userNumber;
//            } else {
//                return factorial * calculateFactorial(userNumber - 1);
//            }
//        } else {
//            System.out.println("Not a valid number");
//            return calculateFactorial(userNumber);
//        }
//    }


    ////    for 4)
//    public static String diceRolls(int diceSides) {
//        int diceOne = (int) (Math.random() * (diceSides ) + 1);
//        int diceTwo = (int) (Math.random() * (diceSides ) + 1);
//        return ("Your numbers are: \n" + diceOne + ", " + diceTwo);
//    }


    //////    for 5)

    public static String playHigherLower(int gameNumber, int userGuess, int guessesLeft) {
        guessesLeft--;
        if (guessesLeft > 0) {
            if (userGuess < gameNumber) {
                return ("HIGHER");
            } else if (userGuess > gameNumber) {
                return ("LOWER");
            } else {
                return ("GOOD GUESS!");
            }

        } else {
            return ("Game Over");
        }
    }

}
