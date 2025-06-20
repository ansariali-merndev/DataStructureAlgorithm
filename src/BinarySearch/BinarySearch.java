package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 16, 17, 29, 32};
        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.println(binarySearch(arr, 29));

        int[] checkArr = {29, 32};
        System.out.println(binarySearch(checkArr, 32));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return  -1;
    }
}
