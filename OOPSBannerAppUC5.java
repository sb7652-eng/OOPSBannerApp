/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * This version combines array declaration and initialization using String.join()
 */

public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // Inline declaration and initialization using String.join()
        String[] lines = {

            String.join(" ", " *** ", "  ***  ", " ***** ", " ***** "),
            String.join(" ", "*   *", " *   * ", "*     *", "*     "),
            String.join(" ", "*   *", " *   * ", "*     *", "*     "),
            String.join(" ", "*   *", " *   * ", " ***** ", " ***** "),
            String.join(" ", "*   *", " *   * ", "*      ", "      *"),
            String.join(" ", "*   *", " *   * ", "*      ", "      *"),
            String.join(" ", " *** ", "  ***  ", "*      ", " ***** ")

        };

        // Enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}