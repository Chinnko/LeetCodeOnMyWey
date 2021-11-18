package page1;

public class Pow50 {
    public static void main(String[] args) {
        System.out.println(-3 % 2);
        System.out.println(myPow(2, 2));
    }


    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        double v = myPow(x, n / 2);
        double z = myPow(x, n % 2);
        return v * v * z;
    }
}
