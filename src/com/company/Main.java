package com.company;

import java.util.Scanner;


public class Main<n> {

    public static void main(String[] args) {
      int n; // input number

    //*******O(1), here no matter how big the input number, runtime will be "Constant" time


    System.out.print("Enter any number to sum with same number: ");
    n = new Scanner(System.in).nextInt();
    System.out.println("sum is: " + (n+n));




     //******** O(log n), One common example of a logarithmic time algorithm is the binary search algorithm
     //running time grows in proportion to the logarithm of the input (in this case, log to the base 2):
     /*
     O(log n) =   log ( 2^3) = 3 (log 2) = 3  ( input = 8 )
                  log ( 2^4) = 4 (log 2) = 4  ( input = 16 )
                  log ( 2^5) = 5 (log 2) = 5  ( input = 32 )
     */


/*  System.out.println("Enter any number for demo O(log n): ");
    n = new Scanner(System.in).nextInt();
    for (int i = 1; i < n; i = i * 2){  //Use log as base 2 to show the demo
    System.out.println("Hey - I'm busy looking at: " + i);
     }*/


     //******* O(n), linear time algorithms (grows directly proportional to the size of its inputs.)

/*      System.out.print("Enter any number for demo O(n): ");
        n = new Scanner(System.in).nextInt();
       for (int i = 0; i < n; i++)
       {
          System.out.println("Hey - I'm busy looking at: " + i);
       }*/


     //******* O(n log n):n log n is the next class of algorithms. The running time grows in proportion to n log n of the input
     // Total = o(n) * O(log n) = O(n long n)

      /*  System.out.println("Enter any number for demo O(n log n): ");
        n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) // O(n)
        {
            for(int j = 1; j < 8; j = j * 2)  //O(log n)
            {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
*/


      //******* O(n^p):Polynomial Time Algorithms (quadratic (n2), cubic (n3), quartic (n4) )
      // number of loop - as power ( two loop , n^2) , three loops ( n^3)
      /*
        System.out.println("Enter any number for demo O(n^p):: ");
        n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) //O(n)
        {
            for(int j = 1; j <= n; j++) //O(n)
            {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }

       */


       //Exponential Time Algorithms – O(k^n)
       //example of an O(2n) time algorithm
       // n= 3, 2^2 = 4, 2^3 = 8, 2^4= 16 , 2^5= 32, 2^6=64
        /*
        System.out.println("Enter any number for demo O(2^n):: ");
        n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= Math.pow(2, n); i++){
            System.out.println("Hey - I'm busy looking at: " + i);
        }

         */


      //********* Factorial Time Algorithms – O(n!) - run time proportional to the factorial of the input size.
      //Example: 2! = 2*1 = 2 , 3! = 3*2*1 = 6 , 4! = 4*3*2*1  = 24 , 5! = 5*4*3*2*1 = 120
       /*

       Factorial:
       ----------
        2! = 2*1       = 2
        3! = 3*2*1     = 6
        4! = 4*3*2*1   = 24
        5! = 5*4*3*2*1 = 120
        */

    /*    System.out.println("Enter any number for demo O(n!):: ");
        n = new Scanner(System.in).nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        for (int i = 1; i <= fact; i++){
            System.out.println("Hey - I'm busy looking at: " + i);
        }  */

        }
    }







