package BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(floorNumber(arr, target));
        System.out.println(floorNumber(arr, 18));
    }

    static int floorNumber(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while(s <= e) {
            int m = s + (e - s) / 2;
            if(arr[m] < target){
                s = m + 1;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                return arr[m];
            }
        }
        return arr[e];
    }
}
