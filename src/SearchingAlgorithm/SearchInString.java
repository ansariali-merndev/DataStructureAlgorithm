package SearchingAlgorithm;

public class SearchInString {
    public static void main(String[] args) {
        String s = "fdjhvdjhfger";
//        System.out.println(s.length());

//        System.out.println(linearSearch(s, 'r'));
//        System.out.println(linearSearch(s, 'z'));

        System.out.println(linearSearch2(s, 'e'));
        System.out.println(linearSearch2(s, 'k'));
    }

    static int linearSearch(String str, char target) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean linearSearch2(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
