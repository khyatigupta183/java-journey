package com.khyati;

public class NumbersExampleRecursion {
    static void main(String[] args) {
        //write a function that takes   in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n ){
        // base condition
        //to stop
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
        // if you ae calling a function again and again, you can treat it as a seperate call in the stack

        //this is called tail recursion
        // this is the last function call
        print(n+1);
    }
}
