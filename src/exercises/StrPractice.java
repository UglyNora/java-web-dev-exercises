package exercises;
import java.util.Scanner;

//A simple java program that searches a given string based upon user initiated search terms.
public class StrPractice {
    public static void main (String[]args) {
        String myStr = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                        " and of having nothing to do: once or twice she had " +
                        " peeped into the book her sister was reading," +
                        " but it had no pictures or conversations in it," +
                        " 'and what is the use of a book,' thought Alice " +
                        "'without pictures or conversation?'";
        String yourStr = myStr.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word and press enter to see if you win.");
        String yourWord = input.nextLine();
        String word = yourWord.toLowerCase();

        if (myStr.contains(word)) {
            System.out.println("You win!");
            System.out.println("The index of the word within the String is: "+ myStr.indexOf(word));
            String anotherStr = yourStr.replace(word, "");
            System.out.println(anotherStr);

        } else {

            System.out.println("Close, but no cigar! Guess again!");
        }


    }
}
