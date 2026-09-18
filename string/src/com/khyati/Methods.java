package com.khyati;

import java.util.Arrays;

public class Methods {
    static void main(String[] args) {
        String name = "khayti gupta";
        System.out.println(Arrays.toString(name.toCharArray()));// created in char array
        System.out.println(name.toLowerCase());
        System.out.println(name );
        System.out.println(name.indexOf('a'));
        System.out.println("     abc    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
