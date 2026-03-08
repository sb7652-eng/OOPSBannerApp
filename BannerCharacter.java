public class BannerCharacter {

    char character;
    String[] pattern;

    public BannerCharacter(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}