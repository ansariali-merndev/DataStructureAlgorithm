package Array;

import java.util.Arrays;

public class MinSubArray {

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }

        public static int minSubArrayLen(int target, int[] nums) {
            int ans = Integer.MAX_VALUE;
            int left = 0;
            int sum = 0;
            Arrays.sort(nums);

            for(int right = 0; right < nums.length; right++) {
                if(sum < target) {
                    sum += nums[right];
                } else {
                    while(sum >= target && left <= right) {
                        ans = Math.min(ans, right-left+1);
                        sum -= nums[left++];
                    }
                }
            }
            return ans;
        }

}
