package SearchingAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};

        System.out.println(searchInRange(arr, 1, 4, 3));
        System.out.println(searchInRange(arr, 1, arr.length, 28));
        System.out.println(searchInRange(arr, 3, arr.length-1, 28));
    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        if(start < 0) {
            return -1;
        }
        if (end >= arr.length) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
