/* 
Write a program that converts a Fahrenheit degree to Celsius using the formula: 
Celcius=(5/9)(Fahrenheit-32). 
*/

package Exercises;

import java.util.Scanner;

public class ConvertTemperature {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double fahrenheit;
        System.out.println("Enter temperature in FAHRENHEIT to convert it to CELSIUS");
        fahrenheit = scan.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " Fahrenheit in Celsius is: " + celsius + " Celsius");
    }
}
