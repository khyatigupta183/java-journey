package com.khyati;

import java.util.Arrays;

public class ChangeValue {
    static void main(String[] args) {
//        creating am array
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
//        arr[0] = 99;  //if you make a change to the object via this ref  variable,same object will be change
        num[0] = 99;
    }
}
