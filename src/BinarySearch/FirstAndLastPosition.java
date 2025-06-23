package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = firstAndLastPosition(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstAndLastPosition(int[] arr, int target) {
        int[] res = {-1, -1};
        res[0] = findFirst(arr, target);
        res[1] = findLast(arr, target);
        return res;
    }
    static int findFirst(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid -1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int findLast(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid -1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
