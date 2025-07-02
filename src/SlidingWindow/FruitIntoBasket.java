package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {0,1,2,2};
        System.out.println(Arrays.toString(fruits));

        int left = 0;
        int maxLen = 0;
        Map<Integer, Integer> basket = new HashMap<>();

        for(int right = 0; right < fruits.length; right++) {
            if(fruits[left] != fruits[right]) {
                if(!basket.isEmpty()) {
                    if(!basket.containsKey(fruits[right])) {
                        for (int i = left; i < right; i++) {
                            if(fruits[i] != fruits[left]) {
                                left = i;
                            }
                        }
                    }
                } else {
                    basket.put(fruits[right], right);
                }
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

//    basket.re
        System.out.println(maxLen);
    }
}
