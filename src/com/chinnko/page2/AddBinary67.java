package page2;

public class AddBinary67 {
    public static void main(String[] args) {

        System.out.println(new AddBinary67().addBinary("00", "0"));
    }

    //10100
    public String addBinary(String a, String b) {
        char[] one = a.toCharArray();
        char[] two = b.toCharArray();
        int[] chars = new int[Math.max(two.length, one.length) + 1];
        int oneIndex = one.length - 1, twoIndex = two.length - 1, upNumber = 0;
        for (int i = chars.length - 1; i > -1; i--) {
            int oneN = oneIndex >= 0 ? one[oneIndex--] - '0' : 0;
            int twoN = twoIndex >= 0 ? two[twoIndex--] - '0' : 0;
            if (oneN + twoN + chars[i] > 1) {
                chars[i - 1] = 1;
            }
            chars[i] = (oneN + twoN + chars[i]) % 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (stringBuilder.length() == 0 && chars[i] == 0) {
                continue;
            }
            stringBuilder.append(chars[i]);
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append(0);
        }
        return stringBuilder.toString();
    }
}
