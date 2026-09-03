package com.khyati;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main(String[] args) {
        int[][] arr = {
                {23, 5, 54},
                {5, 6},
                {-1, 68, 98, 66},
                {7, 2, 34, 5}
        };
        int target = -1;
        int[] ans = search(arr, target); //format of return value{row,col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] srr : arr) {
            for (int element : srr) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
