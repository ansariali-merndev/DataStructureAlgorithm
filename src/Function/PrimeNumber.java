package Function;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(83));
        System.out.println(isPrime(7));
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

