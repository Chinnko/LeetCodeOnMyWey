package page1;

public class DivideTwoIntegers29 {
    public static void main(String[] args) {
        System.out.println(divide(2147483647, 1));
    }


    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
        if (dividend > 0)dividend = -dividend;
        if (divisor > 0) divisor = -divisor;
        int res = 0;
        while (dividend <=divisor) {
            dividend-= divisor;
            res++;
        }
        return sign == 1 ? res : -res;
    }
}
