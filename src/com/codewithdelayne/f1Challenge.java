package com.codewithdelayne;
import java.util.Arrays;


public class f1Challenge {
    public static int[] printFooBarBaz(int[] num) {


        for (int i = 1; i <= num.length; i++) {
            if (i % 6 == 0)
                System.out.print("baz" + " ");

            else if (i % 2 == 0)
                System.out.print("foo" + " ");

            else if (i % 3 == 0)
                System.out.print("bar" + " ");


            else
                System.out.print(i + " ");
        }
        return num;
    }



//   reverse the characters within the sentence while leaving
//    the words in the sentence

    public static String reverseCharacters(String input) {
        String[] words = input.split("\\s");
        String reverseWord="";
        for(String character : words){
            StringBuilder sb = new StringBuilder(character);
            sb.reverse(); //This method reverses the characters within a StringBuilder object.
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }

    public static void main(String[] args) {
    int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(Arrays.toString(printFooBarBaz(num)));

        String input = "the cat is fat";
        System.out.println(reverseCharacters(input));

    }
}

