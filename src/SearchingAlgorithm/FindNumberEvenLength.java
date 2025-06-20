package SearchingAlgorithm;

public class FindNumberEvenLength {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(Math.log10(345345)+1);

        System.out.println(findNumbers(arr));
//        System.out.println(Integer.MIN_VALUE);
    }

    static int findNumbers(int[] arr) {
        int res = 0;
        for(int num: arr) {
            int len = (int)Math.log10(num)+1;
            if (len % 2 == 0) {
                res++;
            }
        }
        return res++;
    }
}
