package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

//Simple java program that calculates the area of a circle based upon user input.

public class Main {
    public static void main(String[]args) {
      Scanner input;
      double radius = 0;
      boolean error = false;

        input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        try {
            radius = input.nextDouble();
        }
        catch (Exception e) {
            error = true;
        }
        input.close();

        if (error) {
            System.out.println("Please enter a number!");

        } else if (radius < 0) {
            System.out.println( "Please enter a positive number!" );
        } else {
            double area = Area.getArea(radius);
            System.out.println("The area of the circle with a radius of " + radius + " is: " + area);
        }

    }
}

