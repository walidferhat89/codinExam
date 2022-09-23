package problems.string;



public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {

        String longestWord = "";
        String str = "Human brain is a biological learning machine";
        String[] words = str.split(" ");
        /*for (String elm : words) {
            System.out.println(words);
        }*/
        int lnghtOfLongest=0;
        for (int i = 0; i < words.length; i++) {
            if (lnghtOfLongest<words[i].length()){
                lnghtOfLongest=words[i].length();
                longestWord=words[i];
                lnghtOfLongest++;

            }
        }
       /* for (String word : words)
            if (lnghtOfLongest < word.length()) {
                lnghtOfLongest = word.length();
                longestWord = word;
                lnghtOfLongest++;
            }*/
        System.out.println("the longest word is: " + longestWord);
        System.out.println("the length of the longest word is : " + longestWord.length());



        }






    }










        //write your code here




