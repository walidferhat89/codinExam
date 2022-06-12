package problems.string;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */

    public static void main(String[] args) {

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";
        String words[] = str.split(" ");
        int count=0;
        for (int i = 0;i< words.length;i++){
            count=1;
            for (int j=i+1;j< words.length;j++){
                if (words[i].equals(words[j])){
                    count++;
                    System.out.println(words[0]);
                }
            }
        }

        //run your code her


    }

}
