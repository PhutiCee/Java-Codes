package Intermediate;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Factorial of: ");
        int num = scan.nextInt();
        System.out.println("Factorial of " + num + " = " + factorial(num));

        scan.close();
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
