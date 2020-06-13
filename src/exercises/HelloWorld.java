package exercises;
import java.util.Scanner;

//A simple java class that receives user's name and then greets the user.

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        input.close();

        System.out.println("Hello, " + name + "!");


    }


}
