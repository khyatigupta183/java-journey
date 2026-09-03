package com.khyati;


public class SearchInRange {
    static void main(String[] args) {

        int[] arr = {18, 12, 5, 78, 7, 6};
        int target = 5;
        System.out.println(linearSearch(arr, target, 3, 0));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = start; index <= end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
