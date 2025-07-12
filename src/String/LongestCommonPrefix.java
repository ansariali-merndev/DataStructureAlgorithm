package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(prefix(str));
    }

    public static String prefix(String[] str) {
        String sb = str[0];
        for (int i = 1; i < str.length; i++) {
            while(!str[i].startsWith(sb)) {
                sb = sb.substring(0, sb.length()-1);
            }
        }
        return sb;
    }
}
