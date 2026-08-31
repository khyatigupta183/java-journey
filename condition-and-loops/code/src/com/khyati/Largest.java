package com.khyati;

import java.util.Scanner;

public class Largest {
    static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();

//      //Q: find the largest of 3
//
//        int max = a;
//        if (b>a){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);

        int max = Math.max(c,Math.max(a, b ));
        System.out.println(max);
    }
}
