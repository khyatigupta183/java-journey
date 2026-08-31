package com.khyati;

public class Scope {
    static void main(String[] args) {
        int a= 10;
        int b= 20;
        String name = "khyati";
        {
//            int a =78;// cannot initialised again but can change the value
            a= 99;// reassign the original ref value to some other variable
            System.out.println(a);
            int c = 99;// anything initialised inside the block can be initialised outside the block but vice-versa is not possible
            System.out.println(name);
            //value initialised in this block ,will remain in block
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c);//cannot use outside the block
        int c = 100;

        for(int i = 0; i<4; i++) {
            System.out.println(i);
            int  num = 90;
            a=900;//can only update the value
        }
//        System.out.println(i);//not use outside
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
