package problems.string;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {
   words();


    }
    public static  String words() {
        String str = "Human brain is a biological learning machine";
        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String longestWord = "";
            int count = 0;
            int word = words[0].length();
            if (words[i].length() > word) {
                words[i] = longestWord;
                count = i;
                count++;
            }
            else return longestWord;

        } return null;
    }
}






        //write your code here




