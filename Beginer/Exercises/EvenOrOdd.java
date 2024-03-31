/*
Write a Java program that takes an integer input from the user and checks if it's 
even or odd using an if-else statement. If the number is even, print "The number 
is even." Otherwise, print "The number is odd.”
*/
package Exercises;

import java.util.Scanner;

public class EvenOrOdd {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number;

        System.out.println("Enter a number to check if its EVEN or ODD");
        number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
