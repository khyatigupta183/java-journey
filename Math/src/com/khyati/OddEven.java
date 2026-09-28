package com.khyati;

public class OddEven {
    static void main(String[] args) {
        // write your code here
        int n =67;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}