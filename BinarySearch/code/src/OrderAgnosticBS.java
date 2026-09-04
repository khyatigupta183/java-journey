public class OrderAgnosticBS {
    static void main(String[] args) {
//        int[] arr = {-1,-3,0,2,3,45,67,88,90};
        int[] arr = {99,88,77,55,34,2,1,0,-5,-5,-7,-95};
        int target = 0;
        int ans = orderagnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderagnosticBS(int[] arr, int target ){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc =  arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }

        while (start <= end){
            //find the middle element
//            int mid = (start+end)/2; // might be possible that (start +end)exceed the range of int in java
            int mid = start + (end -start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                    if(target > arr[mid]){
                        end = mid - 1;
                    }else if (target < arr[mid]){
                        start = mid + 1;
                    }
                }

            }

        return -1;
    }
}
