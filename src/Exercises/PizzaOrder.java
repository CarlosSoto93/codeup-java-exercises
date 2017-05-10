package Exercises;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double small = 6.99;
        double medium = 9.99;
        double large = 12.99;

//        System.out.println("Choose a size: Small $6.99, Medium $9.99, Large $12.99");
//        String size = sc.nextLine();
//        System.out.println("Your order:");
//        System.out.println("Size:" + size);
//        System.out.println("");
//
//        System.out.println("Select your type of pizza:");
//        System.out.println("vegan pepperoni");
//        System.out.println("vegan meat-less lovers");
//        System.out.println("vegan cheese");
//        System.out.println("veggie");
//        System.out.println("vegan supreme");
//        String type = sc.nextLine();
//        System.out.println("You Order:");
//        System.out.println("Size:" + size);
//        System.out.println("Type:" + type);
//        System.out.println("");


        System.out.println("Add Extras: (each extra will cost $1.50)");
        String extras = "Yes";
        String topping = "";
        String more = "Yes";


        if (extras.equalsIgnoreCase("yes")) {
            System.out.println("Type your extra topping");
            topping += sc.nextLine();
            System.out.println("Do you want to add another topping.Type Yes/No");
            extras = sc.next();
        }else {
            System.out.println("Great, your toppings are:");
            System.out.println(topping);
        }

        String extraOne = sc.next();
        String extraTwo = sc.next();
        String extraThree = sc.next();
//        String extraFour = sc.next();
//        String extraFive = sc.next();
//        String extraSix = sc.next();
//        String extraSeven = sc.next();
//        String extraEight = sc.next();
//        String extraNine = sc.next();
//        String extraTen = sc.next();
        System.out.println("You Order:");
//        System.out.println("Size:" + size);
//        System.out.println("Type:" + type);
//        System.out.println("Extras: " + extraOne + ", " + extraTwo + ", " + extraThree);
        System.out.println("");

        sc.nextLine();
//
        System.out.println("Enter Name for order:");
        String name = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter you phone number:");
        String phone = sc.next();

        System.out.println("Your Order: ");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
//        System.out.println("Size:" + size);
//        System.out.println("Type:" + type);
        System.out.println("Extras: " + extraOne + "," + extraTwo + "," + extraThree);
        System.out.println("");
        System.out.println("Total: ");




    }
}
