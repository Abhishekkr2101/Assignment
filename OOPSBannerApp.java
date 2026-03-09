/**
 * OOPSBannerApp
 * UC7 - Character pattern stored in a class
 *
 * @author Abhishek
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = CharacterPattern.createPatternMap();

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c).getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    // Static Inner Class
    static class CharacterPattern {

        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }

        public static Map<Character, CharacterPattern> createPatternMap() {

            Map<Character, CharacterPattern> map = new HashMap<>();

            map.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            map.put('P', new CharacterPattern('P', new String[]{
                    "***** ",
                    "*    *",
                    "*    *",
                    "***** ",
                    "*     ",
                    "*     ",
                    "*     "
            }));

            map.put('S', new CharacterPattern('S', new String[]{
                    " *****",
                    "*     ",
                    "*     ",
                    " *****",
                    "     *",
                    "     *",
                    "***** "
            }));

            return map;
        }
    }
}