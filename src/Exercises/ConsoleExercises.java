package Exercises;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1)
//        System.out.println("Enter an integer.");
//        int value = scan.nextInt();
//        System.out.println("You entered: " + value);

//        2)
//        System.out.println("Enter three words");
//        String wordOne = scan.next();
//        String wordTwo = scan.next();
//        String wordThree = scan.next();
//        System.out.println("You entered: ");
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

//        3)/4)
        System.out.println("Enter a sentence.");
        String sentence = scan.nextLine();
        System.out.println("Your sentence was:" + sentence);

//        1)
        System.out.println("Enter the length and width of the classroom.");
        System.out.println("length:");
        int length = scan.nextInt();
        System.out.println("width:");
        int width = scan.nextInt();
//        2)
        int area = length * width;
        System.out.println("Area = " + area);
        int perimeter = 2 * length + 2 * width;
        System.out.println("Perimeter = " + perimeter);

    }
}
