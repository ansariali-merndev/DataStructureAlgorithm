package Function;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrong(153));
        System.out.println(armstrong(123));
        System.out.println(armstrong(370));
    }

    static boolean armstrong(int num) {
        int original = num;
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            res += (digit * digit * digit);
            num /= 10;
        }
        return res == original;
    }
}
