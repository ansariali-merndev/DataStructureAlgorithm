package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] ascArr = {1,2,3,4,5,6,7,8};
        int[] dscArr = {8,7,6,5,4,3,2,1};

        System.out.println("Ascending Order: " + orderAgnostic(ascArr, 8));
        System.out.println("Descending Order: " + orderAgnostic(dscArr, 1));
    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(isAsc) {
                if(arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if(arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    return  mid;
                }
            }
        }
        return -1;
    }
}
