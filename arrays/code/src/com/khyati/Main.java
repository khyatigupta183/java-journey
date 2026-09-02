package com.khyati;

public class Main {
    static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 no.
//        int[] no = new int[5];
//        //or directly
//        int[] no2 ={6,23,11,2,4};

        int[] no; // declaration of array no is getting defined in the stack
        no = new int[5]; // initialization :actually here object is being created in the memory (heap)

//        System.out.println(no[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        for(String element : arr){
            System.out.println(element);
        }
    }
}
