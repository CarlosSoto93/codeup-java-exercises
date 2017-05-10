package Exercises;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        1) Loop Basics
////        While
        int i = 5;

        while (i <= 15) {
            System.out.println(i);
            i++;
        }
//
////        Do While
//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);
//
//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);
//
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i <= 1000000);
//
////        For
//        for(int i = 100; i >= -10; i -=5) {
//            System.out.println(i);
//        }
//
//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

////        2)Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }

////        3)
//        int number = 0;
//        String anotherNumber;
//
//        do{
//            System.out.println("What number would you like to go up to?");
//            number = sc.nextInt();
//            System.out.println("you number is " + number);
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= number; i++) {
//                System.out.println(i + "      | " + i * i + "       | " + i * i * i);
//            }
//                System.out.println("Continue? Type Yes/No");
//                anotherNumber = sc.next();
//        } while(anotherNumber.equalsIgnoreCase("yes"));

////        4)
//        int grade = 0;
//        String anotherGrade;
//
//        do {
//
//            System.out.println("Enter numerical grade:");
//            grade = sc.nextInt();
//            if (97 <= grade && grade <= 100) {
//                System.out.println("A+");
//            } else if (92 <= grade && grade <= 96) {
//                System.out.println("A");
//            } else if (88 <= grade && grade <= 91) {
//                System.out.println("A-");
//            } else if (86 <= grade && grade <= 87) {
//                System.out.println("B+");
//            } else if (83 <= grade && grade <= 85) {
//                System.out.println("B");
//            } else if (80 <= grade && grade <= 82) {
//                System.out.println("B-");
//            } else if (76 <= grade && grade <= 79) {
//                System.out.println("C+");
//            } else if (71 <= grade && grade <= 75) {
//                System.out.println("C");
//            } else if (67 <= grade && grade <= 70) {
//                System.out.println("C-");
//            } else if (65 <= grade && grade <= 66) {
//                System.out.println("D+");
//            } else if (62 <= grade && grade <= 64) {
//                System.out.println("D");
//            } else if (60 <= grade && grade <= 61) {
//                System.out.println("D-");
//            } else {
//                System.out.println("F");
//            }
//            System.out.println("Continue with another grade? Yes/No");
//            anotherGrade = sc.next();
//            System.out.println("ok");
//        } while (anotherGrade.equalsIgnoreCase("yes"));

////        bonus)
//        System.out.println("Select a number");
//        int numberSelected = sc.nextInt();
//        String number = ";";
//
//        for (int i = 1; i <= numberSelected; i++) {
//            if (numberSelected % i == 0) {
//                number += i+ ", ";
//                System.out.println(numberSelected + "'s factors are" + number);
//
//                if (i == 3 && i == 5 && i == 7) {
//                    System.out.println("Raindrop speak: PlingPlangPlong");
//                    continue;
//                }
//                if (i == 3) {
//                    System.out.println("Raindrop speak: Pling");
//                    continue;
//                }
//                if (i == 5) {
//                    System.out.println("Raindrop speak: Plang");
//                    continue;
//                }
//                if (i == 7) {
//                    System.out.println("Raindrop speak: Plong");
//                }
//            }
//        }

    }
}
