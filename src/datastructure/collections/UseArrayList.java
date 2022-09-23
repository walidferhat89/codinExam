package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(2);
        arraylist.add(4);
        arraylist.add(8);
        arraylist.add(32);
        System.out.println(arraylist);
        arraylist.remove(0);
        System.out.println(arraylist);
        arraylist.add(3,256);
        arraylist.set(1,25);
        System.out.println(arraylist);
        arraylist.iterator();
        Iterator E =arraylist.iterator();
        while (E.hasNext()){
            System.out.println(E.next());
        }
        for (int i = 0; i <arraylist.size() ; i++) {
            System.out.println(i);
        }
        for (int element:arraylist) {
            System.out.println(element);

        }
            }
        }

        //write your code here



