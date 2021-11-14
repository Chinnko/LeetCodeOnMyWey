package 五十;

public class Integer2Roman {

    public static void main(String[] args) {
        System.out.println(intToRoman(3351));
    }

    public static String intToRoman(int num) {
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        int[] value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < value.length; i++) {
            int i1 = num / value[i];
            for (int i2 = 0; i2 < i1; i2++) {
                stringBuilder.append(roman[i]);
            }
            num = num - value[i] * i1;
        }
        return stringBuilder.toString();
    }
}
