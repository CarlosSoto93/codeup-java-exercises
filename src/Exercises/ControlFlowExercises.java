package Exercises;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        1) Loop Basics
////        While
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
////        Do While
//        int count = 0;
//        do{
//            System.out.println(count);
//            count += 2;
//        } while(count <= 100);
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
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) { // is a multiple of both 3 and 5
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

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

////        bonus) Raindrop
//        System.out.println("Select a number");
//        int numberSelected = sc.nextInt();
//        String number = " ";
//        String raindrop = "";
//        int i = 0;
//
//        do {
//            i++;
//            if (numberSelected % i == 0) {
//                number += i + ", ";
//
//                switch (i) {
//                    case (3):
//                        raindrop = "Pling";
//                        continue;
//                    case (5):
//                        raindrop += "Plang";
//                        continue;
//                    case (7):
//                        raindrop += "Plong";
//                }
//
////               if (i == 3) {
////                   raindrop = "Pling";
////               }else if (i == 5) {
////                   raindrop += "Plang";
////               }else if (i == 7) {
////                   raindrop += "Plong";
////               }
//
//            }
//        } while (i <= numberSelected);
//        System.out.println(numberSelected + "'s factors are " + number);
//        if (raindrop != "") {
//            System.out.println("Raindrop-speak: " + raindrop);
//        } else {
//            System.out.println("Raindrop-speak: " + "\"" + numberSelected + "\"");
//        }

////        bonus) Average and lowest grades
//
//        System.out.println("Input your 10 grades");
//        int lowestGrade = 100;
//        int gradeOne = sc.nextInt();
//        int gradeTwo = sc.nextInt();
//        int gradeThree = sc.nextInt();
//        int gradeFour = sc.nextInt();
//        int gradeFive = sc.nextInt();
//        int gradeSix = sc.nextInt();
//        int gradeSeven = sc.nextInt();
//        int gradeEight = sc.nextInt();
//        int gradeNine = sc.nextInt();
//        int gradeTen = sc.nextInt();
//
//        int average = (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive + gradeSix + gradeSeven + gradeEight + gradeNine + gradeTen) / 10;
//        System.out.println("Average: " + average);
//
//        if (gradeOne < lowestGrade){
//            lowestGrade = gradeOne;
//        }
//        if ( gradeTwo < lowestGrade){
//            lowestGrade = gradeTwo;
//        }
//        if ( gradeThree < lowestGrade){
//            lowestGrade = gradeThree;
//        }
//        if ( gradeFour < lowestGrade){
//            lowestGrade = gradeFour;
//        }
//        if ( gradeFive < lowestGrade){
//            lowestGrade = gradeFive;
//        }
//        if ( gradeSix < lowestGrade){
//            lowestGrade = gradeSix;
//        }
//        if ( gradeSeven < lowestGrade){
//            lowestGrade = gradeSeven;
//        }
//        if ( gradeEight < lowestGrade){
//            lowestGrade = gradeEight;
//        }
//        if ( gradeNine < lowestGrade){
//            lowestGrade = gradeNine;
//        }
//        if ( gradeTen < lowestGrade){
//            lowestGrade = gradeTen;
//        }
//        System.out.println("Lowest Grade: " + lowestGrade);

////        bonus) Zoologist
//
//        System.out.println("What animal do you want to study? ");
//        System.out.println("Elephants/ Giraffes/ Chimpanzees (Default)");
//        String animalToStudy = sc.next();
//
//        if (animalToStudy.equalsIgnoreCase("elephants")) {
//            System.out.println("Ok, Elephants it is then.");
//            System.out.println("There are 4 Elephants, input their ages");
//            int ageOne = sc.nextInt();
//            int ageTwo = sc.nextInt();
//            int ageThree = sc.nextInt();
//            int ageFour = sc.nextInt();
//        }else if (animalToStudy.equalsIgnoreCase("giraffes")) {
//            System.out.println("Ok, Giraffes it is then.");
//            System.out.println("There are 3 Giraffes, input their ages");
//            int ageOne = sc.nextInt();
//            int ageTwo = sc.nextInt();
//            int ageThree = sc.nextInt();
//        }else if (animalToStudy.equalsIgnoreCase("chimpanzees")) {
//            System.out.println("OK, Chimpanzees it is then.");
//            System.out.println("There are 8 Chimpanzees, input their ages");
//            int ageOne = sc.nextInt();
//            int ageTwo = sc.nextInt();
//            int ageThree = sc.nextInt();
//            int ageFour = sc.nextInt();
//            int ageFive = sc.nextInt();
//            int ageSix = sc.nextInt();
//            int ageSeven = sc.nextInt();
//            int ageEight = sc.nextInt();
//        }else {
//            System.out.println("We'll just do Chimpanzees.");
//            System.out.println("There are 8 Chimpanzees, input their ages");
//            int ageOne = sc.nextInt();
//            int ageTwo = sc.nextInt();
//            int ageThree = sc.nextInt();
//            int ageFour = sc.nextInt();
//            int ageFive = sc.nextInt();
//            int ageSix = sc.nextInt();
//            int ageSeven = sc.nextInt();
//            int ageEight = sc.nextInt();
//        }


    }
}
