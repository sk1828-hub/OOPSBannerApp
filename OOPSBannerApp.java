
/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 2 by improving
 * the way the "OOPS" banner is constructed and displayed.
 * It utilizes the String.join() method to create each line
 * of the banner instead of using the + operator for string concatenation.
 *
 * This approach reduces intermediate String object creation
 * and improves memory efficiency and readability.
 *
 * @author Developer
 * @version 3.0
 */

// Extend use case UC2 to use String.join() method to create each line
// of the "OOPS" banner instead of concatenating strings using + operator.

public class OOPSBannerApp {

    // Main method to run the banner display
    // Each line corresponds to a row in the banner for O, O, P, S.
    // Using String.join() for better readability and efficiency.

    public static void main(String[] args) {

        System.out.println(String.join(" "," *****  "," *****  "," ****** "," ****** "));
        System.out.println(String.join(" ","*     * ","*     * ","*     * ","*     * "));
        System.out.println(String.join(" ","*     * ","*     * ","*     * ","*       "));
        System.out.println(String.join(" ","*     * ","*     * ","******  "," *****  "));
        System.out.println(String.join(" ","*     * ","*     * ","*       ","      * "));
        System.out.println(String.join(" ","*     * ","*     * ","*       ","*     * "));
        System.out.println(String.join(" "," *****  "," *****  ","*       "," *****  "));
        
    }
}