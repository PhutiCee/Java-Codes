/*
 * The process of finding the largest value (i.e., the maximum of a group of values) 
 * is used frequently in computer applications. For example, a program that 
 * determines the winner of a sales contest would input the number of units sold by 
 * each sales person. The sales person who sells the most units wins the contest. 
 * Write a Java application that inputs a series of 10 integers and determines and 
 * prints the largest integer. Your program should use at least the following three 
 * variables: 
 * a. counter: A counter to count to 10 (i.e., to keep track of how many numbers 
 * have been input and to determine when all 10 numbers have been processed). 
 * b. number: The integer most recently input by the user. 
 * c. largest: The largest number found so far
 */

package Exercises;

import java.util.Scanner;

public class LargestInteger {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        int largest = 0;

        System.out.println("--------ENTER 10 INTEGERS AND IDENTIFY THE LARGEST INTEGER--------");
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Enter integer " + (counter + 1) + ":");
            number = scan.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The largest integer is: " + largest);
    }
}
