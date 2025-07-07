package Recursion;

import java.util.ArrayList;

public class SubsetCondition {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        subset(arr, 0, new ArrayList<Integer>(), 0);
    }

    static boolean subset(int[] arr, int sum, ArrayList<Integer> list, int index) {
        if(index >= arr.length || sum > 2) {
            if(sum == 2) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[index]);
        sum += arr[index];
        boolean left = subset(arr, sum, list, index+1);

        if(left) return true;

        list.removeLast();
        sum -= arr[index];
        return subset(arr, sum, list, index+1);

    }
}
