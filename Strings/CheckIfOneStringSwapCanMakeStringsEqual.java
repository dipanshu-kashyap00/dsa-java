package Strings;

public class CheckIfOneStringSwapCanMakeStringsEqual {

    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            int misMatchChar[] = new int[2];
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    count++;
                    if (count > 2) {
                        return false;
                    }
                    misMatchChar[count - 1] = i;
                }
            }
            return s1.charAt(misMatchChar[0]) == s2.charAt(misMatchChar[1]) &&
                    s1.charAt(misMatchChar[1]) == s2.charAt(misMatchChar[0]);
        }
    }

    public static void main(String[] args) {

    }
}