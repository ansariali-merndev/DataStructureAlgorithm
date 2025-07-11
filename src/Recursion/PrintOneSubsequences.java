package Recursion;

import java.util.ArrayList;

public class PrintOneSubsequences {
    static int actualSum = 2;
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};

        subset(0, arr, 0, new ArrayList<>());
    }

    static boolean subset (int index, int[] arr, int sum, ArrayList<Integer> list) {
        if(index >= arr.length || sum > actualSum) {
            if(sum == actualSum) {
                System.out.println(list);
                return true;
            } else {
                return false;
            }
        }
        sum += arr[index];
        list.add(arr[index]);
        boolean ans = subset(index+1, arr, sum, list);

        if(!ans) {
            sum -= arr[index];
            list.removeLast();
            return subset(index+1, arr, sum, list);
        } else {
            return true;
        }
    }
}
