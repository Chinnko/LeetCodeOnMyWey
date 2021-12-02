package page3;

public class ValidPalindrome125 {


    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean nextP(char ceq) {
        if ((ceq >= 'a' && ceq <= 'z') || (ceq >= '0' && ceq <= '9')) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int start = 0, end = chars.length - 1;
        while (start != end) {
            char ces = chars[end];
            char css = chars[start];
            if (!nextP(ces)) {
                end--;
                continue;
            }
            if (!nextP(css)) {
                start++;
                continue;
            }
            if (ces == css) {
                start++;
                if (start == end) {
                    return true;
                }
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
