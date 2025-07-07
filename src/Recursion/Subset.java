package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, res, new ArrayList<>());
        return res;
    }

    public static void helper (int index, int[] arr, List<List<Integer>> ans, ArrayList<Integer> list) {
        if(index >= arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        helper(index+1, arr, ans, list);
        list.removeLast();
        helper(index+1, arr, ans, list);
    }
}
