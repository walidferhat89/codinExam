package datastructure.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(32);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(3,256);
        list.set(1,25);
        System.out.println(list);

        //write your code here

    }
}
