package Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcccc";
        System.out.println(checkPalindrome(str, str.length()-1, 0));
    }

    static boolean checkPalindrome(String str, int right, int left) {
        if(left >= right) {
            return true;
        }
        if(str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return checkPalindrome(str, right-1, left+1);
    }
}
