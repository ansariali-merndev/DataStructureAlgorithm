package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
       String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));

//       Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//
//        }
//        System.out.println(map);

    }

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
        }

        return len;
    }
}
