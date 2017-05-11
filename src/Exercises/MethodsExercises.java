package Exercises;


public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5,5));
        System.out.println(subtraction(5,5));
        System.out.println(multiplication(5,5));
        System.out.println(division(5,5));
        System.out.println(modulus(5,5));
    }

////        1)
    public static int addition(int x, int y) {
        int answer = x + y;
        return answer;
    }

    public static int subtraction(int x, int y) {
        int answer = x - y;
        return answer;
    }

    public static int multiplication(int x, int y) {
        int answer = x * y;
        return answer;
    }

    public static int division(int x, int y) {
        int answer = x / y;
        return answer;
    }

    public static int modulus(int x, int y) {
        int answer = x % y;
        return answer;
    }
}
