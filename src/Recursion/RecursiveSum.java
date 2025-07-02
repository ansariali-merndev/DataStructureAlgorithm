package Recursion;

import java.util.Scanner;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans  = parametric(n, 0);
        int res = functional(n);
        System.out.println("Parametric: " + ans);
        System.out.println("Functional: " + res);
    }

    static int functional(int n) {
        if(n < 1) {
            return 0;
        }
        return n + functional(n-1);
    }

    static int  parametric(int n, int sum) {
        if(n < 1) {
            return sum;
        }
        return parametric(n-1, sum+n);
    }
}
