package BinarySearch;

import java.util.Arrays;

public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
//        System.out.println(Arrays.toString(letters));
        System.out.println(nextGreaterElement(letters, 'a'));
        System.out.println(nextGreaterElement(letters, 'c'));
    }


    static char nextGreaterElement(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(letters[mid] > target) {
                end = mid -1;
            } else if(letters[mid] < target) {
                start = mid + 1;
            } else {
                return letters[mid+1];
            }
        }
        return letters[start % letters.length];
    }
}
