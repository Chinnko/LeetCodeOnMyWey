package page1;

import java.util.*;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"", ""}));
//        System.out.println(isSame("eat", "ata"));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<String> objects;
        List<List<String>> arrayLists = new ArrayList<>();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        Set<String> strings = stringIntegerHashMap.keySet();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            boolean isAdd = false;
            for (String string : strings) {
                if (isSame(string, str)) {
                    arrayLists.get(stringIntegerHashMap.get(string)).add(str);
                    isAdd = true;
                }
            }
            if (!isAdd) {
                objects = new ArrayList<>();
                objects.add(str);
                arrayLists.add(objects);
                stringIntegerHashMap.put(str, arrayLists.size() - 1);
            }
        }

        return arrayLists;
    }

    public static boolean isSame(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> stringIntegerHashMap = new HashMap<>();
        char[] s2c = s2.toCharArray();
        for (int i = 0; i < s2c.length; i++) {
            stringIntegerHashMap.put(s2c[i], stringIntegerHashMap.get(s2c[i]) == null ? 1 : stringIntegerHashMap.get(s2c[i]) + 1);
        }
        for (char c : s1.toCharArray()) {
            if (stringIntegerHashMap.get(c) == null) {
                return false;
            }
            int i = stringIntegerHashMap.get(c) - 1;
            if (i < 0) {
                return false;
            }
            stringIntegerHashMap.put(c, i);
        }

        return true;
    }

}
