package com.khyati;

public class Shadowing {
    static int x = 90; // this will be shadowed at line  8
    static void main(String[] args) {
    System.out.println(x);//90
        int x;// declaration
//        System.out.println(x);// error ,first initialise x than use
        x = 40;// initialisation
        System.out.println(x);//40
    fun();
    }
    static void fun(){
        System.out.println(x);
    }

}
