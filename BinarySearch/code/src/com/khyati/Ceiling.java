package com.khyati;

public class Ceiling {
    static void main(String[] args) {
      int[] arr = {-1,-3,0,2,3,45,67,88,90};
     int target = 100;
     int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    //return the index of smallest no  >= target

    static int ceiling(int[] arr , int  target){

        // but iff the target is greater then the gretest no. in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end =arr.length-1;

        while (start <= end){
            //find the middle element
//            int mid = (start+end)/2; // might be possible that (start +end)exceed the range of int in java
            int mid = start + (end -start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
        return start;
    }
}
