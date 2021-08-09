import java.util.Optional;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "flower";
        strings[1] = "flow";
        strings[2] = "flight";
        longestCommonPrefix(strings);
    }

    public static String longestCommonPrefix(String[] strs) {
        int minLenth = 201;
        int pos = 0;
        for (int i = 0; i < strs.length; i++) {
            minLenth = Math.min(strs[i].length(), minLenth);
            if (strs[i].length() == minLenth) {
                pos = i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = strs[pos].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < strs.length; i1++) {
                if (strs[i1].charAt(i) == chars[i]) {
                    if (i1 == strs.length - 1) {
                        stringBuilder.append(chars[i]);
                    }
                } else {
                    return stringBuilder.toString();
                }
            }
        }
        return stringBuilder.toString();
    }
}
