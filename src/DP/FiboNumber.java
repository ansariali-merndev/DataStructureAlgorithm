package DP;

import java.util.Arrays;
import java.util.Scanner;

public class FiboNumber {
    public static void main(String[] args) {
//        System.out.println(fibo(5));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("Fibonacci number: " + fibo(n, dp));
        System.out.println("DP arrays: " + Arrays.toString(dp));
        System.out.println("Tabulation: " + table(n));
    }

    //Tabulation
    public static int table(int n) {
        int p2 = 0;
        int p1 = 1;
        for(int i = 2; i <= n; i++) {
            int ans = p2 + p1;
            p2 = p1;
            p1 = ans;
        }
        return p1;
    }

    //Memoization
    public static int fibo(int n, int[] dp) {
        if(n <= 1) {
            return n;
        }

        if(dp[n] != -1) return dp[n];
        dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
        return dp[n];
    }
}
