package com.khyati;

public class Floor {
    static void main(String[] args) {
      int[] arr = {-1,-3,0,2,3,45,67,88,90};
     int target = 10;
     int ans = floor(arr,target);
        System.out.println(ans);
    }
    //return the index : greatest no. <= target

    static int floor(int[] arr , int  target){

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
        return end;
    }
}
