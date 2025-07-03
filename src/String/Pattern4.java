package String;

public class Pattern4 {
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }

    static void pattern(int n) {
        for (int col = 1; col <= n; col++) {
            for (int row = 1; row <= n-col; row++) {
                System.out.print("  ");
            }
            for (int row = 1; row <= col; row++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
