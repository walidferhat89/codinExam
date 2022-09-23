package datastructure.collections;

import java.util.*;

public class UseCollections {










    /* *
     * given 2 arrays, array1 and array2*/
    /* int[] array1 = {1, 3, 2, 4, 8, 9, 0};
       int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};*/
    /* *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     **/

    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7,5};



        Set<Integer> hashset =  new HashSet<>();
        List<Integer> arrayList = new ArrayList<>();
        for(int elm:array1){
            hashset.add(elm);
        }
        for (int elm2:array2) {
            hashset.add(elm2);

        }
        for (int num:array1) {
            arrayList.add(num);
        }
        for (int num2:array2) {
            arrayList.add(num2);
            Collections.sort(arrayList);
        }
        System.out.println("hashSet :" +hashset);
        System.out.println("arrayList : "+ arrayList);











        //write your code here

    }

}
