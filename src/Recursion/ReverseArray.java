package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        System.out.println("Original Array: " + Arrays.toString(arr));

        func(0, arr.length-1, arr);
        System.out.println("Reverse Array: " + Arrays.toString(arr));
    }

    static void func(int left, int right, int[] arr){
        if(left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        func(left+1, right-1, arr);
    }
}
