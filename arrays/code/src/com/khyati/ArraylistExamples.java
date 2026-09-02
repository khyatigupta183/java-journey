package com.khyati;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class ArraylistExamples {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(23);
//        list.add(34);
//        list.add(2445);
//        list.add(35);
//        list.add(2);
//        list.add(23567);
//
//        System.out.println(list.contains(23));
//        System.out.println(list);
//        //update (index, element)
//        list.set(0, 99);
//        //remove index
//        list.remove(2);
//        System.out.println(list);

        //input
        for(int i = 0; i<5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for(int i = 0; i<5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
