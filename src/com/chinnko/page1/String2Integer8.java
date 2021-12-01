package page1;

import jdk.nashorn.internal.ir.IfNode;

public class String2Integer8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("-9223372036854775808"));
    }
//    "4193 with words"
//"  -0012a42"
//    00000-42a1234

    public static int myAtoi(String s) {
        char[] chars = s.toCharArray();
        long num = 0;
        int ans = 1;
        boolean hasK = false;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (!hasK && aChar == '-') {
                hasK = true;
                ans = -1;
                continue;
            }
            if (!hasK && aChar == '+') {
                hasK = true;
                continue;
            }
            if (aChar == ' ' && !hasK) {
                continue;
            }
            if (aChar <= '9' && aChar >= '0') {
                hasK = true;
                num = (aChar - '0') + num * 10;
                if (ans > 0) {
                    if (num > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    if (num < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    if (-num > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    if (-num < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                }

            } else {
                break;
            }
        }
        if (num == 0) {
            return (int) num;
        }

        return (int) (ans * num);
    }
}
