package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;
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

       /* adding element to the list*/
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(32);
        System.out.println(list);

        /*removing element from the list*/
        list.remove(0);
        System.out.println(list);

        /*replacing element in the list using the index of the element*/
        list.add(3,256);
        list.set(1,25);
        System.out.println(list);

        /*convert the list to an iterator*/
        Iterator it = list.iterator();
        /*while loop with iterator*/
        while (it.hasNext()){
            System.out.println(it.next());
        }
        /*for loop*/
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(i);
        }
        /*for each loop*/
        for (int element : list) {
            System.out.println(element);

        }

        //write your code here

    }
}
