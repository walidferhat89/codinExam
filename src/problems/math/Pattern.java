package problems.math;

public class Pattern {
    /*
     *
     * read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     * 100,99,98,97,96,95,94,93,92,91,90,
     * 88,86,84,82,80,78,76,74,72,70,
     * 67,64,61,58,55,52,49,46,43,40,
     * 36,32,28,24,20,16,12,8,4,09
     *
     */

    public static void main(String[] args) {
          for (int i = 90; i <= 100; i++) {
            System.out.println(i);
            //write your code here

        }


        for (int i=69;i<89;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }
        for (int i=40;i<68;i=i+3){

                System.out.println(i);
        }

        for (int i = 0; i < 37; i = i + 4) {

            System.out.println(i);
        }

    }
    }