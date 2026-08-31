package com.khyati;

import java.util.Arrays;
//variable arguments
public class VarArgs {
    static void main(String[] args) {
        demo(78,90,99);//cannot be empty
        arr ();//can be empty
        fun(23,6,"khyati","pari");// variable no. of arguments
    }

    static void demo (int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo (String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void arr(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }
}
