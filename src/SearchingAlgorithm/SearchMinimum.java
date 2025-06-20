package SearchingAlgorithm;

public class SearchMinimum {
    public static void main(String[] args) {
        int[] arr = {18, -290, 12, 7, 3, 14, 28, -1};
        System.out.println(findMinimum(arr));
    }

    static int findMinimum(int[] arr) {
        int res = Integer.MAX_VALUE;
        for(int num: arr) {
            if(res > num) {
                res = num;
            }
        }
        return res;
    }
}
