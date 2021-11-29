package page2;

import java.util.HashMap;

public class InterleavingString97 {

    public static void main(String[] args) {
        System.out.println(new InterleavingString97().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    public boolean success = false;

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return success;
        }

        dp(s3.toCharArray(), s2.toCharArray(), s1.toCharArray(), 0, 0, 0, new boolean[s1.length()][s2.length()]);
        return success;
    }


    public void dp(char[] s3cs, char[] s2cs, char[] s1cs, int pos1, int pos2, int pos3, boolean[][] booleans) {
        if (pos3 == s3cs.length) {
            success = true;
            return;
        }
        if (pos1 < s1cs.length && pos2 < s2cs.length && booleans[pos1][pos2]) return;
        if (pos2 <= s2cs.length - 1 && s2cs[pos2] == s3cs[pos3]) {
            dp(s3cs, s2cs, s1cs, pos1, pos2 + 1, pos3 + 1, booleans);
        }
        if (pos1 <= s1cs.length - 1 && s1cs[pos1] == s3cs[pos3]) {
            dp(s3cs, s2cs, s1cs, pos1 + 1, pos2, pos3 + 1, booleans);
        }
        if (pos2 < s2cs.length && pos1 < s1cs.length)
            booleans[pos1][pos2] = true;


    }
}
