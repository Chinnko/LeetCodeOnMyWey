package 五十;


public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        String s1 = s.substring(0, 1);
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = i + 1; i1 < chars.length; i1++) {
                String substring = s.substring(i, i1);
                if (enter(substring)) {
                    if (s1.length() < substring.length()) {
                        s1 = substring;
                    }
                }
            }
        }
        return s1;
    }

    public static boolean enter(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
