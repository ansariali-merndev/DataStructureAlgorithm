package SearchingAlgorithm;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,18,9,14,77,3};
        System.out.println(Arrays.toString(arr));

        System.out.println(linearSearch(arr, 14));
        System.out.println(linearSearch(arr, 108));
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
