package Beginer;

import java.util.Random;

public class PracticeBasic {
    public static void main(String[] args) {
        int bucky[] = new int[10];
        int difference = 0;

        Random rand = new Random();

        for (int counter = 0; counter < bucky.length; counter++) {
            bucky[counter] = 1 + rand.nextInt(6);
        }

        System.out.print("int bucky[] = {");
        for (int i = 0; i < bucky.length; i++) {
            System.out.print(bucky[i] + ",");
        }
        System.out.print("}");
    }
}
