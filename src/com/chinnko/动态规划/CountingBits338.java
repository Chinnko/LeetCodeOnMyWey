package 动态规划;

public class CountingBits338 {

    public static void main(String[] args) {
        System.out.println(countBits(5));
    }

    public static int[] countBits(int n) {
        int[] ints = new int[n + 1];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = get2Byte(i);
        }
        return ints;
    }

    public static int get2Byte(int n) {
        int out = 0;
        while (true) {
            if (n % 2 == 1) {
                out = out + 1;
            }
            n = n >>2;
            if (n == 0) {
                return out;
            } else if (n == 1) {
                out = out + 1;
                return out;
            }
        }
    }

}
