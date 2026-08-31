package com.khyati;

import java.util.Scanner;

public class Sum {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int num1 = input.nextInt();
       Float num2 = input.nextFloat();

       Float sum = num1 + num2 ;

       System.out.println("sum = " + sum);


    }
}
