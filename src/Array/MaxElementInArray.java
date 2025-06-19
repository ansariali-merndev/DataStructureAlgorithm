package Array;

import java.util.Arrays;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {12, 39, 87, 15, 53, 99, 176, 14, 12, 9};

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Maximum Number: " + maxNum(arr));
    }

    static int maxNum(int[] arr) {
        int res = 0;
        for(int num: arr) {
            if(res < num) {
                res = num;
            }
        }
        return  res;
    }
}
