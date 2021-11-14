package 五十;


public class MultiplyStrings43 {
    public static void main(String[] args) {
        System.out.println(multiply("498828660196", "840477629533"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        char[] num1s = num1.toCharArray();

        char[] num2s = num2.toCharArray();

        int[] int1 = new int[num1.length()];
        for (int i = 0; i < num1s.length; i++) {
            int1[i] = num1s[i] - '0';
        }
        int[] int2 = new int[num2.length()];
        for (int i = 0; i < int2.length; i++) {
            int2[i] = num2s[i] - '0';
        }

        for (int i = int1.length - 1; i >= 0; i--) {
            long i1 = int1[i];

            if (i1 != 0) {
                i1 = (long) (i1 * Math.pow(10, int1.length - i - 1));
                for (int j = int2.length - 1; j >= 0; j--) {
                    long j1 = (long) (int2[j] * Math.pow(10, int2.length - j - 1));
                    if (j1 != 0) {
                        out = (i1 * j1) + out;
                    }
                }
            }

        }
        return String.valueOf(out);

    }

}
