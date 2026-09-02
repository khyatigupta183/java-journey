package com.khyati;

public class Max {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 18};
        System.out.println(maxRange(arr, 1,3));
        System.out.println(max(arr));
    }
// imagine that arr is not empty

    static int max(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

        int maxVal = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i]> maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
     //range
    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int maxVal = arr[start];
            if(arr[i]> maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
