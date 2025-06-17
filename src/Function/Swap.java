package Function;

public class Swap {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 7;

        swap(num1, num2);
        System.out.println(num1 + " " + num2 );
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
