package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> list = new ArrayList<>();
        subsequences(0, list, arr);
    }

    static void subsequences(int index, List<Integer> list, int[] arr) {
        if(index >= arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subsequences(index+1, list, arr);
        list.removeLast();
        subsequences(index+1, list, arr);
    }
}
