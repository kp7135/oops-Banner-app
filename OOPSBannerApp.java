/**
 * OOPSBannerApp - UC5
 * Compact Array Initialization with String.join()
 *
 * @author Karthik
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Combined declaration + initialization
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ******", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "****** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", "*     *", "*     *", "*      ", "*     *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}