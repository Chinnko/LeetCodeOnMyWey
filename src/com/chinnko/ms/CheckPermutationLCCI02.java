package ms;

import java.util.Arrays;

public class CheckPermutationLCCI02 {
    public static void main(String[] args) {

    }

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();
        Arrays.sort(s1c);
        Arrays.sort(s2c);
        for (int i = 0; i < s1c.length; i++) {
            if (s1c[i] != s2c[i]) {
                return false;
            }
        }
        return true;
    }
}
