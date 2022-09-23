package problems.string;


import java.util.Arrays;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */

    public static void main(String[] args) {
        isAnagram("CAT","ACT" );
        isAnagram("ARMY" ,"MARY");
        isAnagram("Java","Python");

        //run your code here

    }

    public static boolean isAnagram(String str1, String str2) {



        if (str1.length() != str2.length()) {
            System.out.println(str1+" and "+str2+" are not anagram");
            return false;
        }
        else{
            char[]strArray1 = str1.toCharArray();
            char[]strArray2=str2.toCharArray();
            Arrays.sort(strArray1);
            Arrays.sort(strArray2);
            System.out.println(str1+" and "+str2+" are anagram.");
            return Arrays.equals(strArray1,strArray2);

        }


    }
}