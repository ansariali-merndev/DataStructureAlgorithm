package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        System.out.println("Original Array"  + Arrays.toString(arr));
        System.out.println("Sorted Array" + Arrays.toString(mergeSort(arr)));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 1)));
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return helper(left, right);
    }

    static int[] helper(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                ans[k] = left[i++];
            } else {
                ans[k] = right[j++];
            }
            k++;
        }

        while(i < left.length) {
            ans[k++] = left[i++];
        }

        while (j < right.length) {
            ans[k++] = right[j++];
        }

        return ans;
    }
}
