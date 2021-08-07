public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        long y = x;
        if (y < 0) {
            y = y * (-1);
        }
        String s = String.valueOf(y);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char current = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = current;
        }
        Long answer = Long.valueOf(String.valueOf(chars));
        answer = x > 0 ? answer : -answer;
        if (answer > (Math.pow(2, 31) - 1) || answer < ((-1) * Math.pow(2, 31))) {
            return 0;
        }
        return answer.intValue();
    }

}
