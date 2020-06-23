package org.launchcode.java.studios.countingcharacters;
//import java.util.*;
public class CharacterCount {

    public static void main (String[] args) {

     String myString = "If the product of two terms is zero" +
             " then common sense says at least one of the two terms" +
             " has to be zero to start with. " +
             "So if you move all the terms over to one side, " +
             "you can put the quadratics into a form that can be factored" +
             " allowing that side of the equation to equal zero. " +
             "Once you’ve done that, it’s pretty straightforward from there.";
     int matches = 0;
     int length = myString.length();

     //Convert given string to an array of characters.
     int[] numChars = new int[300];


     for(int i = 0; i < length; i++)
         numChars[myString.charAt(i)] ++;


         //Initialize another array
      char [] charArray  = myString.toCharArray();
      for ( int i = 0; i < length; i++) {
          charArray[i] = myString.charAt(i);
          for (int j =0; j <=i; j++) {
              if (myString.charAt(i) == charArray[j]) {
                  matches ++;

              }
              if (matches == 1)
                  System.out.println(myString.charAt(i) + ":" + numChars[myString.charAt(i)]);

          }
      }






}
}
