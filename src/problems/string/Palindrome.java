package problems.string;

import java.util.Arrays;

public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */

    public static void main(String[] args) {
isPalindrome("kayak");
        //write your code here

    }

    public static void isPalindrome(String str) {
       /* char[] charArray = str.toCharArray();
        int reversedIndex = 0;
        String reversedStr="";

        for (int i= str.length()-1;i>=0;i--) {
            charArray[reversedIndex]=str.charAt(i);
            reversedIndex++;
            *//*System.out.println(charArray);*//*
        }
        for (int i = 0; i < str.length() ; i++) {
                reversedStr+=charArray[i];



        }

        if (reversedStr.equals(str)){
            System.out.println(str+" is a palidrome");
        }
*/


        /*return false;*/

        char[]charArr = str.toCharArray();
        int reverseIndex = 0;
        for (int i = str.length()-1; i >=0 ; i--) {
            charArr[reverseIndex]=str.charAt(i);
            reverseIndex++;
        }

        String reversedStr="";
        for (int i = 0; i < charArr.length; i++) {
            reversedStr+=charArr[i];
        }
        if (reversedStr.equals(str)){
            System.out.println(str + " is a palindrome");
        }
    }
}
