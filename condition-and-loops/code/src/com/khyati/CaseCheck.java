package com.khyati;

import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        //System.out.println(in.next());

//        System.out.println(ch);

        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else {
          System.out.println("upper case");
        }
    }
}
