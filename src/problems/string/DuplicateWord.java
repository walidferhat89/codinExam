package problems.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {
    public static void main(String[] args) {
        duplicated();
    }

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */

    public static void duplicated () {

        String str = "Java is a programming Language . Java is also an Island of Indonesia. Java is widely used language ," +
                " Java is also coffee.";

        String[] words = str.split(" ");

        Set<String>duplicate= new HashSet<>();
        for (int i = 0;i< words.length;i++){

            for (int j=i+1;j< words.length;j++){
                if (words[i].equalsIgnoreCase(words[j])){
                    duplicate.add(words[i]);


                }
            }

        }System.out.println(duplicate);

        //run your code her

    }

}
