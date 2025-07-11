package Recursion;

public class CombinationSum4 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 4;

        int ans = backtrack(nums, 0, target);
        System.out.println(ans);
    }

    public static int backtrack(int[] nums, int index, int target) {
        if(target == 0) {
            return 1;
        }
        if(target < 0 || index == nums.length) {
            return 0;
        }

        int left = backtrack(nums, index, target - nums[index]);
        int right = backtrack(nums, index+1, target);

        return left  + right;
    }
}
