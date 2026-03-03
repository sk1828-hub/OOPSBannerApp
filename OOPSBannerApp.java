/**

OOPSBannerApp UC4 – OOPS Banner Display Application




This class demonstrates rendering the word "OOPS" as a banner

using ASCII art composed of asterisks (*) and spaces. The banner

is displayed line by line on the console.







storing the banner lines inside a String array and printing

them using a loop. This approach eliminates repetitive

print statements and improves code readability and maintainability.







The banner lines are constructed using the String.join() method

to combine the characters for the letters O, O, P, and S.




@author Developer

@version 4
*/
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] lines = new String[7];

        // Populate array using String.join()
        lines[0] = String.join(" ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*   * ", "*    ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   * ", "*    ");
        lines[3] = String.join(" ", "*   *", "*   *", "***** ", " *** ");
        lines[4] = String.join(" ", "*   *", "*   *", "*     ", "    *");
        lines[5] = String.join(" ", "*   *", "*   *", "*     ", "*   *");
        lines[6] = String.join(" ", " *** ", " *** ", "*     ", " *** ");

        // Loop through array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}