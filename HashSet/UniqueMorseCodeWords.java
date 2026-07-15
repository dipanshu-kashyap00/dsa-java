package HashSet;

import java.util.HashSet;

public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String codes[] = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            String buildMorseCode = "";
            for (char ch : word.toCharArray()) {
                String code = codes[ch - 'a'];
                buildMorseCode += code;
            }
            set.add(buildMorseCode);
        }
        return set.size();
    }

}
