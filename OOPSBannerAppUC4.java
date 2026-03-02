/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * @author Swetha
 * @version 4
 */

public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Step 1: Create String array of 7 lines
        String[] lines = new String[7];

        // Step 2: Populate array using String.join()
        lines[0] = String.join(" ", " *** ", " *** ", " *****", " *****");
        lines[1] = String.join(" ", "*   *", "*   *", "*     ", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "***** ", "***** ");
        lines[3] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[4] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[5] = String.join(" ", "*   *", "*   *", "*     ", "*   * ");
        lines[6] = String.join(" ", " *** ", " *** ", "***** ", "***** ");

        // Step 3: Use enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}