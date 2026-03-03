/**
 * OOPSBannerApp - UC6
 * Using Static Helper Methods
 *
 * @author Karthik
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                    String.join("   ",
                            o[i],
                            o[i],
                            p[i],
                            s[i])
            );
        }
    }

    // Static method for O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for P
    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}