package String;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pattern(num);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            if(row == 1 || row == n) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("X ");
                }
            } else {
                for (int col = 1; col <= n; col++) {
                    if(col == 1 || col == n) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
