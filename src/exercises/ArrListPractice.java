package exercises;

import java.util.*;




public class ArrListPractice {


    public static void main (String[] args) {
         ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
         ArrayList<String> words = new ArrayList<>(Arrays.asList("obliterate","tatterdemalion", "dog", "cat", "piano"));
         int sumNum = sum(numbers);
         System.out.println(sumNum);
         System.out.println(ListToStr(words));
         System.out.println(StrHasFive(words));



    }

    public static int sum(List<Integer> list){
        int sum = 0;
        for(int i : list){
            if(i %2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static StringBuilder ListToStr(List<String> list) {
        StringBuilder stringsInList = new StringBuilder();
        for (String s : list){
            stringsInList.append(s);
            stringsInList.append("\t");
        }

        return stringsInList;
    }

    public static String StrHasFive(List<String> list) {

        String word = "";
        for (int i =0; i < list.size(); i++) {
          word = list.get(i);

        }


            return word;


    }

}





