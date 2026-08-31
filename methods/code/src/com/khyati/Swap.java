package com.khyati;

public class Swap {
    static void main(String[] args) {
        int a = 10;
        int b = 20;

//        swap number code
//        int temp = a;
//        a=b;
//        b= temp;
        swap(a, b);

        System.out.println(a + " " + b);

        String name = "khyati";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name) {
        name= "pari";
    }
    static void swap(int a, int b ){
        int temp = a;
        a=b;
        b=  temp;
        //this change will only be valid in this function scope only
    }
}
