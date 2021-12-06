package page2;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        int maxCount = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i > -1; i--) {
            char aChar = chars[i];
            if (aChar == ' ') {
                if (maxCount != 0) {
                    return maxCount;
                }
            }
            if ((aChar <= 'Z' && 'A' <= aChar) || (aChar <= 'z' && 'a' <= aChar)) {
                maxCount++;
            }
        }
        return maxCount;
    }

}
