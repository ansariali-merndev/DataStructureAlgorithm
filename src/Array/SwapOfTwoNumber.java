package Array;

import java.util.Arrays;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        int[] arr = {12,3,4,25,91,7};
        System.out.println(Arrays.toString(arr));

        swap(arr, 1, arr.length-2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
