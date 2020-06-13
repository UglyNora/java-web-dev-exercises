package exercises;
import java.util.Scanner;

//A simple java program that calclates miles per gallon based on prompted user responses.
public class MilesPerGallon {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven today?");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did your car use today?");
        double gallonGas = input.nextDouble();
        input.close();

       double milesPerGalLon =  miles/gallonGas;
        String mpgDouble = String.format("%.2f", milesPerGalLon);

        System.out.println("Wow! " + mpgDouble+ " mpg is awesome!");

    }
}
