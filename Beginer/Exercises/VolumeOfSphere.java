/*
 * Write a complete Java application to prompt the user for the double radius of a 
 * sphere, and call method sphereVolumeto calculate and display the volume of the 
 * sphere. Use the following statement to calculate the volume: double volume = 
 * (4.0 / 3.0)*Math.PI*Math.pow(radius,3).
 */

package Exercises;

import java.util.*;

public class VolumeOfSphere {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double radii;
        double radius = 0.0;
        System.out.println(
                "ENTER THE DIAMETER (DOUBLE RADIUS) OF A SPHERE TO CALCULATE VOLUME\n------------------------------------------------------------------");
        radii = scan.nextDouble();
        radius = (double) radii / 2.0;
        sphereVolume(radius);
    }

    public static void sphereVolume(double rad) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(rad, 3);
        System.out.println(
                "Radius = " + rad + "\n------------------------------------------\nVolume of sphere is " + volume
                        + "\n------------------------------------------");
    }
}
