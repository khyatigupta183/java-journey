package com.khyati;

public class Countnums {
    static void main(String[] args) {
        int n= 25444;

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
