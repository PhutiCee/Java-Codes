package Beginer;

import java.util.Scanner;

public class Subtract {
    static Scanner scan = new Scanner(System.in);

    static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    static int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static double quotiant(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers to get Difference\n--------------------------------");
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = scan.nextInt();

        System.out.println("-----------------------------------");
        System.out.println("Sum: " + subtract(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + product(num1, num2));
        System.out.printf("Quotiant: %.3f", quotiant(num1, num2));
        System.out.println("\n-----------------------------------");
    }
}
