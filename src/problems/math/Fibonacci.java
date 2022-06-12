package problems.math;

public class Fibonacci {

     public static int fiboNumber(int N){
         int num1=0;
         int num2=1;
         int num3;
         int count = 0;
         System.out.println("Fibonacci Series till " + N + " terms:");

        for (count=1; count>N ;count=+1){

             num3 =  num1+ num2;
            num1=num2;
            num2=num3;




        }



    //run your code here


         return num1;
     }

    public static void main(String[] args) {

        fiboNumber(30);
    }
}



/*
                                                 *
                                                 * write 30 Fibonacci numbers with java
                                                 * 0,1,1,2,3,5,8,13
                                                 *
                                                 */



