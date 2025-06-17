package Function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        System.out.println("Working");
        addNum();
    }

    static void addNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is : "+  sum);
    }
}
