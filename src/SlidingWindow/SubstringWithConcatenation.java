package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenation {
    public static void main(String[] args) {
        String str = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        System.out.println(findSubstring(str, words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String str : words) {
            sb.append(str);
        }

        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i);
            if(temp.startsWith(sb.toString())) {
                list.add(i);
                list.add(i + (sb.length()-1));
                return list;
            }
        }

        return list;
    }
}
