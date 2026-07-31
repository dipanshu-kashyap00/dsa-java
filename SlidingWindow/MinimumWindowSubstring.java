package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }

        int required = mapT.size();
        int l = 0, r = 0;
        int create = 0;
        int[] ans = { -1, 0, 0 };
        Map<Character, Integer> subStringMap = new HashMap<>();

        while (r < s.length()) {
            char c = s.charAt(r);
            subStringMap.put(c, subStringMap.getOrDefault(c, 0) + 1);

            if (mapT.containsKey(c) && subStringMap.get(c).intValue() == mapT.get(c).intValue()) {
                create++;
            }
            while (l <= r && create == required) {
                if (ans[0] == -1 || (r - l + 1) < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                char leftChar = s.charAt(l);
                subStringMap.put(leftChar, subStringMap.get(leftChar) - 1);

                if (mapT.containsKey(leftChar) &&
                        subStringMap.get(leftChar).intValue() < mapT.get(leftChar).intValue()) {
                    create--;
                }

                l++;
            }

            r++;
        }

        if (ans[0] == -1) {
            return "";
        }

        return s.substring(ans[1], ans[2] + 1);
    }

}
