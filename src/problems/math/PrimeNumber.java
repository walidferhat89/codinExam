package problems.math;

import java.util.ArrayList;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {
        System.out.println(primeNumber(2,1000000));
    }
    public static ArrayList<Integer> primeNumber(int start,int end){
           ArrayList<Integer> primes = new ArrayList<>();
           for (int n=start;n<end;n++){
               int i = 2;
               boolean isPrime = true;
               while (i <=n/2){
                   i++;
                   if (n%i==0){
                       isPrime=false;
                       break;
                   }
               }
               if (isPrime){
                   primes.add(n);
               }
           }
        return primes;
        }
}


