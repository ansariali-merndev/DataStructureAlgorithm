package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,3,4};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int ans = 0;
        int count = 0;
        for(int num : arr){
            if(count == 0){
                ans = num;
            }
            if (num == ans) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}
