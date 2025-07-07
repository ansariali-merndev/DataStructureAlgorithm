package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSumSubset {

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        subset(0, nums, new ArrayList<>(), 0);
    }

    static void subset(int index, int[] arr, List<Integer> list, int sum ) {
        if(index >= arr.length || sum > 2) {
            if(sum == 2) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        sum += arr[index];
        subset(index+1, arr, list, sum);
        list.removeLast();
        sum -= arr[index];
        subset(index+1, arr, list, sum);
    }
}
