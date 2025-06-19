package Array;

import java.util.ArrayList;

public class CommonElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("apple");
        list1.add("banana");
        list1.add("orange");
        list1.add("banana");
        list1.add("grapes");

        list2.add("banana");
        list2.add("kiwi");
        list2.add("banana");
        list2.add("apple");
        list2.add("apple");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        System.out.println("Common List: " + commonElement(list1, list2));
    }

    static ArrayList<String> commonElement(ArrayList<String> l1, ArrayList<String> l2) {
        ArrayList<String> res = new ArrayList<>();

        for (String str : l1) {
            if(l2.contains(str) && !res.contains(str)) {
                res.add(str);
            }
         }
        return res;
    }
}
