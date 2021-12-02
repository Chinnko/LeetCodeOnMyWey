package page1;

public class WildcardMatching44 {
    public static void main(String[] args) {
        System.out.println(isMatch("bc", "??"));
    }


    public static boolean isMatch(String s, String p) {
        if (s.length() == 0) {
            char[] chars = p.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != '*') {
                    return false;
                } else {
                    if (i == chars.length - 1) {
                        return true;
                    }
                }
            }
        }
        return dp(s.toCharArray(), p.toCharArray(), 0, 0, new boolean[s.length()][p.length()]);

    }

    public static boolean dp(char[] sdp, char[] dpp, int sp, int pp, boolean[][] map) {
        if (sp == sdp.length && pp == dpp.length) {
            return true;
        }
        if (pp > dpp.length - 1 || sp > sdp.length - 1) {
            if (pp <= dpp.length - 1) {
                for (int i = pp; i < dpp.length; i++) {
                    if (dpp[i] != '*') {
                        return false;
                    } else {
                        if (i == dpp.length - 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        if (dpp[pp] == '*') {
            map[sp][pp] = true;
            return dp(sdp, dpp, sp + 1, pp + 1, map) || dp(sdp, dpp, sp + 1, pp, map) || dp(sdp, dpp, sp, pp + 1, map);
        }
        if (dpp[pp] == '?') {
            map[sp][pp] = true;
            return dp(sdp, dpp, sp + 1, pp + 1, map);
        }

        if (dpp[pp] == sdp[sp]) {
            map[sp][pp] = true;
            return dp(sdp, dpp, sp + 1, pp + 1, map);
        }
        return false;
    }
}
