package page1;

import java.util.*;

public class LetterCombinationsPhoneNumber17 {

    public static void main(String[] args) {
        System.out.println(new LetterCombinationsPhoneNumber17().letterCombinations("23"));
    }

    ArrayList<String> arrayList = new ArrayList<>();
    Map<Character, List<String>> map = new HashMap<>();

    {
        map.put('2', Arrays.asList(new String[]{"a", "b", "c"}));
        map.put('3', Arrays.asList(new String[]{"d", "e", "f"}));
        map.put('4', Arrays.asList(new String[]{"g", "h", "i"}));
        map.put('5', Arrays.asList(new String[]{"j", "k", "l"}));
        map.put('6', Arrays.asList(new String[]{"m", "n", "o"}));
        map.put('7', Arrays.asList(new String[]{"p", "q", "r", "s"}));
        map.put('8', Arrays.asList(new String[]{"t", "u", "v"}));
        map.put('9', Arrays.asList(new String[]{"w", "x", "y", "z"}));
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return arrayList;
        }
        dps(digits, new LinkedList<String>(), 0);
        return arrayList;
    }

    public void dps(String digits, LinkedList<String> list, int x) {
        if (list.size() == digits.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String s : list) {
                stringBuilder.append(s);
            }
            arrayList.add(stringBuilder.toString());
            return;
        }
        char[] chars = digits.toCharArray();
        for (int i = x; i < chars.length; i++) {
            for (String string : map.get(chars[i])) {
                list.add(string);
                dps(digits, list, i + 1);
                list.removeLast();
            }
        }

    }
}
