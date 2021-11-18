package page1;

import java.util.ArrayList;

public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if (s.length() < numRows||numRows==1)
            return s;
        ArrayList<StringBuilder> chars = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            chars.add(new StringBuilder());
        }
        char[] chars1 = s.toCharArray();
        boolean isDown = false;
        int pos = 0;
        for (char c : chars1) {
            if (pos == 0 || pos == numRows - 1) {
                isDown = !isDown;
            }
            chars.get(pos).append(c);
            pos = isDown ? pos + 1 : pos - 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder aChar : chars) {
            stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }



}
