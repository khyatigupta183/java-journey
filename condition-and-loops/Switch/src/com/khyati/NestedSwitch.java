package com.khyati;

import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("khyati");
            case 2 -> System.out.println("anshika");
            case 3 -> {
                System.out.println("---");
                switch (department) {
                    case "CSE" -> System.out.println("CSE department");
                    case "DOC" -> System.out.println("doctor");
                    default -> System.out.println("no department");
                }
            }
            default -> System.out.println("enter correct employ");
        }
    }
}
