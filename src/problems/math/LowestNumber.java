package problems.math;

public class LowestNumber {
    /*
     *
     * write java code to find the lowest number from the given array
     *
     */

    public static void main(String[] args) {

        int []array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        int temp = array[0];
        for (int i = 0;i< array.length;i++){
            if (array[i]<temp){
                temp=array[i];

            }

        }
        System.out.println("the smallest number is : " + temp);

    }
}
