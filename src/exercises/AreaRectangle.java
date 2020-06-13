package exercises;
import java.util.Scanner;

//A simple program that prompts user for the length and width of a rectangle to print the area.

public class AreaRectangle {
    public static void main(String[]args) {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = input.nextDouble();
        input.close();
        double area = width * length;
        System.out.println("The area of the rectangle is: " + area);


    }

}
