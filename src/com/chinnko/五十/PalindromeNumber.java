package 五十;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1211));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}
