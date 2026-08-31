package com.khyati;

import org.w3c.dom.ls.LSOutput;

public class OverLoading {
    static void main(String[] args) {
        int ans = sum(6,0,5);
            System.out.println(ans);

        fun("khyati",70);
        fun(90);
    }

    static int sum(int a, int b ){
        return a+b;
    }

    static int sum(int a, int b,int c ){
//        return a+b;
        return a+b+c;
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name, int b){
        System.out.println(name);
    }
}
