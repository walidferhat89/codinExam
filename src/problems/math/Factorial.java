package problems.math;


public class Factorial {


    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */
    public static int sum(int F) {
        if (F>0){
            return F * (sum(F- 1));
        }
        else {
            return 1;
        }





}
}




        //run your code here





