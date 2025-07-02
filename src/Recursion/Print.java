package Recursion;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        print1(1, n);

        print2(n);
    }

    static void print1(int p, int n) {
        if(p > n) {
            return;
        }
        System.out.println(p++);
        print1(p, n);
    }

    static void print2(int n) {
        if(n < 1) return;
        System.out.println(n--);
        print2(n);
    }
}
