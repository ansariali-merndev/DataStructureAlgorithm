package String;

public class ProcessString {
    public static void main(String[] args) {
        String s = "a#b%*";
//        System.out.println(processStr(s));
    }

    public static char processStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if (s.charAt(i) == '#') {
                sb = new StringBuilder(sb.toString().repeat(2));
            } else if (s.charAt(i) == '%') {
                sb.reverse();
            } else {
                sb.append(s.charAt(i));
            }
        }

        if(k < sb.length() && !sb.isEmpty()) {
            return sb.charAt(k);
        }
        return '.';
    }
}
