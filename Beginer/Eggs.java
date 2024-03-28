package Beginer;

import java.util.Scanner;

public class Eggs {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Prices
        final double dozenPrice = 125.67;
        final double loosePrice = 3.5;

        // Get user input
        System.out.print("Enter the number of eggs: ");
        int numEggs = scanner.nextInt();

        // Calculate dozens and loose eggs
        int dozens = numEggs / 12; // Dividing the total number of eggs by 12 gives you the whole number of dozens.
                                   // This is because a dozen is a unit of 12 items. For example, if you have 30
                                   // eggs, dividing by 12 (30 / 12) gives you 2, which means you have 2 dozens of
                                   // eggs.
        int looseEggs = numEggs % 12; // The remainder obtained after dividing by 12 represents the number of eggs
                                      // that are not part of a complete dozen. These are the loose eggs. In the
                                      // example with 30 eggs, dividing by 12 gives a remainder of 6 (30 % 12),
                                      // indicating that you have 6 loose eggs along with the 2 dozens

        // Calculate total price
        double totalPrice = dozens * dozenPrice + looseEggs * loosePrice;

        // Display a cute output like keabetswe
        System.out.println("You ordered " + numEggs + " eggs.");
        // If we have a dozen and more then show how many dozens are there
        if (numEggs >= 12) {
            System.out.println("That's " + dozens + " dozen at R" + String.format("%.2f", dozenPrice) + " per dozen");
        }

        // If looseEgg is not zero then show how many eggs
        if (looseEggs != 0) {
            System.out.println("and " + looseEggs + " loose eggs at R" + String.format("%.2f", loosePrice) + " each\n");
        }
        System.out.println("---------------------------------------------");
        System.out.println("| for a total of R" + String.format("%.2f", totalPrice) + ".");
        System.out.println("---------------------------------------------\n");
    }
}
