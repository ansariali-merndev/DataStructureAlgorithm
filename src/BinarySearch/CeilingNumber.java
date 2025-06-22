package BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ceilingNumber(arr, target));
    }

    static int ceilingNumber(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] < target) {
                s = m + 1;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                return arr[m];
            }
        }
        return arr[s];
    }
}
