package org.launchcode.java.studios.countingcharacters;
import java.util.*;
public class CharacterCount {

    public static void main (String[] args) {
     HashMap<Character, Integer> movieQuote = new HashMap<>();
     String myString = "If the product of two terms is zero" +
             " then common sense says at least one of the two terms" +
             " has to be zero to start with. " +
             "So if you move all the terms over to one side, " +
             "you can put the quadratics into a form that can be factored" +
             " allowing that side of the equation to equal zero. " +
             "Once you’ve done that, it’s pretty straightforward from there.";
     int count = 0;
     char[] charactersInString = myString.toCharArray();

     for(char ch: charactersInString) {
        char nextChar = ch;
        count ++;
         if (ch == nextChar) {

             movieQuote.put(ch, count);

         }


     }



    }
}
