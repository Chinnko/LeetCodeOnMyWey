public class String2Integer {
    public static void main(String[] args) {
        System.out.println(myAtoi("  0000000000012345678"));


    }

    public static int myAtoi(String s) {
        char[] chars = s.trim().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Character character = new Character((char) 45);
        Character add = new Character((char) 43);
        boolean parZero = false;
        for (char aChar : chars) {
            if (add.equals(aChar) && !stringBuilder.toString().contains("+") && stringBuilder.toString().length() == 0) {
                if (stringBuilder.toString().contains("-")) {
                    break;
                } else if (parZero) {
                    break;
                }
                stringBuilder.append("+");
                continue;
            }
            if (character.equals(aChar) && !stringBuilder.toString().contains("-") && stringBuilder.toString().length() == 0) {
                if (stringBuilder.toString().contains("+")) {
                    break;
                }else if (parZero) {
                    break;
                }
                stringBuilder.append("-");
                continue;
            }
            if (Character.isDigit(aChar)) {
                if (stringBuilder.length() == 0 && aChar == 48) {
                    parZero = true;
                    continue;
                }
                stringBuilder.append(aChar);
            } else {
                break;
            }
        }
        if (stringBuilder.toString().length() == 0 || (stringBuilder.length() == 1 && stringBuilder.toString().equals("-"))) {
            return 0;
        }
        if (stringBuilder.toString().length() == 0 || (stringBuilder.length() == 1 && stringBuilder.toString().equals("+"))) {
            return 0;
        }
        int i;
        String s1 = stringBuilder.toString();
        if (s1.length() > String.valueOf(Integer.MAX_VALUE).length()) {
            if (s1.contains("-")) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        Long aLong = Long.valueOf(s1);
        if (aLong > Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else if (aLong < Integer.MIN_VALUE) {
            i = Integer.MIN_VALUE;
        } else {
            i = aLong.intValue();
        }
        return i;
    }

}
