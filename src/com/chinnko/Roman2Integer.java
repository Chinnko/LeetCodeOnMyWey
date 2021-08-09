public class Roman2Integer {

    public static void main(String[] args) {
        System.out.println(romanToInt("MIII"));

    }

    public static int romanToInt(String s) {
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int outNumber = 0;
        int[] value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < roman.length; i++) {
            while (s.indexOf(roman[i]) == 0) {
                s = s.substring(roman[i].length());
                outNumber = outNumber + value[i];
            }
        }
        return outNumber;
    }
}
