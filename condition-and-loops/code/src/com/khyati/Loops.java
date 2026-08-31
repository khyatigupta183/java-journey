package com.khyati;

import java.util.Scanner;

public class Loops {
    static void main() {
        /*
        syntax of for loops:
        for (initialisation; condition; increment/decrement){
        //body
        }
         */

//        for(int i =1 ; i<=10; i++) {
//            int f =i*5;
//            System.out.println(f);
//        }

        //print number from 0 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for(int i = 0; i<=n; i++){
////            int k = i;
////            System.out.println(k);
//            System.out.print("hello world ");
//        }
        //while loops
        /*
        syntax:
        while (condition){
        //body
        }
         */

//        int num = 1;
//        while(num<=5){
//            System.out.println(num);
//            num += 1;
//        }
        // do while
        /*
        do{

        } while(condition);

         */
      int n = 7;
      do{
          System.out.println(n);
          n++;
      }while(n<=5);
    }
}
