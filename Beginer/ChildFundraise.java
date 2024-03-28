package Beginer;

import java.util.Scanner;

public class ChildFundraise {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of Adult meals sold");
        int adultMeals = scan.nextInt();

        System.out.println("Enter number of Child meals sold");
        int childMeals = scan.nextInt();

        double adultMealsProfit = adultMeals * 7.0;
        double childMealsProfit = childMeals * 4.0;

        double total = adultMealsProfit + childMealsProfit;

        System.out.println("Profit for Adult is: " + adultMealsProfit);
        System.out.println("Profit for Child is: " + childMealsProfit);

        System.out.println("Total profit " + total);
    }
}
