package SearchingAlgorithm;


import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 19, 35},
                {29, 19, 14, 32, 73, 89},
                {12, 71, 51},
                {90, 92},
        };

        int target = 71;
//        System.out.println(Arrays.toString(searchIn2D(arr, target)));
        int[] result = searchIn2D(arr, target);

        System.out.println("Checking: " + arr[result[0]][result[1]]);
        System.out.println(maxValue(arr));
    }

    static int[] searchIn2D(int[][] arr, int target) {
        int[] res = {-1, -1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    res[0] = row;
                    res[1] = col;
                    return res;
                }
            }
        }
        return res;
    }


    static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] num: arr) {
            for(int element: num) {
                if (max < element) {
                    max = element;
                }
            }
        }
        return max;
    }
}
