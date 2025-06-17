package Function;

import java.util.Scanner;

public class ReturnValue {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);

        String ansStr = greeting();
        System.out.println(ansStr);
    }

    static String greeting() {
        return "Welcome back user";
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        return num1 + num2;
    }
}
