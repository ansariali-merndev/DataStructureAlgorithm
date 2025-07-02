package Recursion;

import java.util.Scanner;

public class Print2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
        System.out.println();
        reverse(1,n);
    }

static void reverse(int p, int n) {
        if(p > n) {
            return;
        }
        reverse(p+1, n);
    System.out.print(p + " ");
}


    static void print(int n) {
        if(n < 1) {
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }
}
