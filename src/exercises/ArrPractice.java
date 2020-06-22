package exercises;

import java.util.Arrays;

public class ArrPractice {
    public static void main (String[] args) {
        int[] someRandomInts = {1, 1, 2, 3, 5, 8};
        for (int i : someRandomInts) {
            if(i %2 != 0) {
                System.out.println(i);
            }
        }
        String drSuess = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house." +
                " I will not eat them with a mouse. ";

        String newString[] = drSuess.split("\\.");
        System.out.println(Arrays.toString(newString));


    }
}
