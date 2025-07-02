package Recursion;

public class PrintName {
    public static void main(String[] args) {
        func("Ali", 0);
    }

    static void func(String name, int times) {
        if(times >= 5) {
            return;
        }
        System.out.println(name + times);
        times++;
        func(name, times);
    }
}
