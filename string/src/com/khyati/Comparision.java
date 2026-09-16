package com.khyati;

public class Comparision {
    static void main(String[] args) {
        String a ="khyati";
        String b = "khyati";
        String c = a;
        System.out.println(c == a);
        // ==
        System.out.println(a == b);

        String name1= new String ("khyati");
        String name2 = new String("khyati");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }
}
