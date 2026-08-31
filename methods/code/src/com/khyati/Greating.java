package com.khyati;

import java.util.Scanner;

public class Greating {
    static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.print("enter no.1: ");
        num1 = in.nextInt();
        System.out.print("enter no. 2: ");
        num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("the sum = " + sum);
    }
}
