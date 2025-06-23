package BinarySearch;

public class FindPositionInInfiniteArray {
    public static void main(String[] args) {

    }
    static int findPositionInInfiniteArray(int[] arr, int target) {
        if (arr.length < 1) return -1;
        int start = 0;
        int end = 1;
        int value = arr[0];

        while (value < target) {
            start = end;
            end = 2 * end;
            value = arr[end];
        }
        return binarySearch(arr, start, end, target);
    }
    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
