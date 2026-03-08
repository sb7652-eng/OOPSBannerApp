import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void renderBanner(String word, Map<Character, BannerCharacter> map) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (char c : word.toCharArray()) {

                BannerCharacter bc = map.get(c);

                if (bc != null) {
                    System.out.print(bc.getPattern()[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerCharacter> map = new HashMap<>();

        map.put('O', new BannerCharacter('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        map.put('P', new BannerCharacter('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        map.put('S', new BannerCharacter('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        renderBanner(word, map);
    }
}