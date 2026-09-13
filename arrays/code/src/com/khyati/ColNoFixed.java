package com.khyati;

public class ColNoFixed {
    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {3,4},
                {4,5,6}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col =0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1; // 1st one is also unique
        int k = 1;
        for (int i =1; i <nums.length; i++){
            if(nums[i] != nums[k-1]){
                nums[k]=nums[i];
                k++;
                count ++;
            }
        }
        return count;
    }
}