package 五十;


public class MultiplyStrings43 {
    public static void main(String[] args) {

    }

    class Solution {
        public String multiply(String num1, String num2) {
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

            int[] ints = new int[int1.length + int2.length];
            for (int i = 0; i < int1.length; i++) {
                for (int i1 = 0; i1 < int2.length; i1++) {
                    ints[i + i1] = int1[i] * int2[i1] + ints[i + i1];
                }
            }

            for (int i = ints.length - 1; i > 0; i--) {
                ints[i - 1] = ints[i - 1] + Math.max(ints[i] / 10, 0);
                ints[i] = ints[i] % 10;
            }
            for (int i = ints.length - 1; i > 0; i--) {
                ints[i - 1] = ints[i - 1] + Math.max(ints[i] / 10, 0);
                ints[i] = ints[i] % 10;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < ints.length - 1; i++) {
                stringBuilder.append(ints[i]);
            }
            return stringBuilder.toString();
        }
    }
}
