package page2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        int[] ints = new PlusOne66().plusOne(new int[]{9});
        System.out.println(ints);
    }

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] / 10 == 1) {
                if (i - 1 < 0) {
                    int[] ints = new int[digits.length + 1];
                    ints[0] = 1;
                    digits[i ] = digits[i] % 10;
                    for (int i1 = 1; i1 < ints.length; i1++) {
                        ints[i1] = digits[i];
                    }
                    return ints;
                } else {
                    digits[i - 1] = digits[i - 1] + 1;
                    digits[i] = digits[i] % 10;
                }
            }
        }
        return digits;
    }
}
