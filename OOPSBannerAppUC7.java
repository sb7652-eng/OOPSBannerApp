/**
 * Banner Application to display OOPS using character patterns
 */
public class OOPSBannerAppUC7 {

    /**
     * Inner Static Class to store Character and its pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "**** ",
                    "*   *",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    ",
                    "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ****",
                    "*    ",
                    "*    ",
                    " *** ",
                    "    *",
                    "    *",
                    "**** "
            })
        };

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                for (CharacterPatternMap map : patterns) {

                    if (map.getCharacter() == c) {
                        line.append(map.getPattern()[i]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}