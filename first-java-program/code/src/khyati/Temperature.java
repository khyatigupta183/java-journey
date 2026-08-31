package com.khyati;

import java.util.Scanner;

public class Temperature {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter temp in C: ");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5)+32;
        System.out.println(tempF);

    }
}
