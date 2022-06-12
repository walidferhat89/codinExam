package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\walid\\IdeaProjects\\eat-java-coding-exam\\src\\readfile\\file-data");
        Scanner scan= new Scanner(file);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }
    }

    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */



}
