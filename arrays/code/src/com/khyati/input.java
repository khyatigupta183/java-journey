package com.khyati;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives
//        int[] arr = new int[3];
//        arr[0] = 99;
//        arr[1] = 6;
//        arr[2] = 87;
        //[99,6,87]
//        System.out.println(arr[2]);

        //input using for loop

//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }

        //best way to print in arrays
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }

//        for (int num : arr) {//for every element in array, print the element
//            System.out.print(num + " ");//here num represents element of the array
//        }

        //array of objects
        String[] str = new String[4];
        for (int i =0; i<str.length; i++){
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "khyati";

        System.out.println(Arrays.toString(str));
      }
}
