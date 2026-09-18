package com.khyati;

public class SB {
    static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString()); // not creating new, modified in last one

        builder.deleteCharAt(0);
        builder.reverse();
        System.out.println(builder);
    }
}
