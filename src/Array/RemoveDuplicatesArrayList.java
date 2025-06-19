package Array;

import java.util.ArrayList;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grapes");

        System.out.println("Original List: " + list);

        System.out.println("Remove Duplicates: " + remove(list));
    }

    static ArrayList<String> remove(ArrayList<String> list) {
        ArrayList<String> res = new ArrayList<>();
        for (String s : list) {
            if (!res.contains(s)) {
                res.add(s);
            }
        }
        return res;
    }
}

