/*
Write an application that ask the user to enter two integers, obtains them from the 
user and print their sum, product, difference and quotient(division) 
 */
package Exercises;

import java.util.Scanner;

public class BasicArithmetic {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double sum = 0.0;
        double product;
        double difference = 0.0;
        double quotient = 0.0;

        System.out.println(
                "ENTER TWO NUMBERS TO GET SUM, PRODUCT, DIFFEENCE AND QUOTIENT(DIVISION)\n-----------------------------------------------------------------------");
        System.out.print("Enter first number: ");
        firstNumber = scan.nextDouble();

        System.out.print("Enter second number: ");
        secondNumber = scan.nextDouble();

        // Sum
        sum = firstNumber + secondNumber;

        // Product
        product = firstNumber * secondNumber;

        // Difference
        difference = firstNumber - secondNumber;

        // Quotient (Division)
        quotient = firstNumber / secondNumber;

        // Results
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " = " + sum);
        System.out.println("Product of " + firstNumber + " and " + secondNumber + " = " + product);
        System.out.println("Difference of " + firstNumber + " and " + secondNumber + " = " + difference);
        System.out.println("Quotient of " + firstNumber + " and " + secondNumber + " = " + quotient);
        System.out.println("-----------------------------------------------------------------------\n");
    }
}
