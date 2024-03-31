/*
 * Write a Java application that allows the user to enter up to 20 integer grades into 
 * an array. Stop the loop by typing in ‐1. Your main method should call an Average 
 * method that returns the average of the grades. Use the DecimalFormat class to 
 * format the average to 2 decimal places.
 */

package Exercises;

import java.util.Scanner;

public class FindAverage {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int SIZE = 6;
        int grades[] = new int[SIZE];

        System.out.println(
                "ENTER 20 INTEGERS TO CALCULATE AVERAGE\n[NB: TO EXIT PROGRAM INPUT -1]\n---------------------------------------------------");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter integer " + (i + 1) + " of " + grades.length);
            int userGrade = scan.nextInt();
            if (userGrade != -1) {
                grades[i] = userGrade;
            } else {
                break;
            }
        }
        System.out.printf("Average is: %.2f%n", average(grades, SIZE));
    }

    public static double average(int arr[], int length) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / length;
    }
}
