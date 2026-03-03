/**
 * OOPSBannerApp - UC4 Implementation
 * Prints "OOPS" banner using String array and loop.
 *
 * @author Karthik
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store each banner line in an array
        String[] banner = {

            String.join("   ", " ***** ", " ***** ", " ******", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "****** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", "*     *", "*     *", "*      ", "*     *"),
            String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}