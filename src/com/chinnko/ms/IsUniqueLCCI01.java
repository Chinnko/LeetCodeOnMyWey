package ms;

import java.util.Arrays;
import java.util.HashMap;

public class IsUniqueLCCI01 {
    public static void main(String[] args) {

    }

    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;

    }
}
