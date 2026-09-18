package com.khyati;

public class Palindrome {
    static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();
    }
}
