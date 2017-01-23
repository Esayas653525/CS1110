/* PROJECT:  SimpleStringMethods
 * AUTHOR:  Dr. Kaminski (based on Gaddis example)
 * DESCRIPTION:  Shows 3 simple String class's methods:
 *          length, toUpperCase, toLowerCase
 *****************************************************************************/

package simplestringmethods;

import javax.swing.JOptionPane;

public class SimpleStringMethods {

    public static void main(String[] args) {

    // ------------------------------------------------------ DECLARE VARIABLES
    String cityName;
    int charCount;
    
    // ------------------------------------------------------------------ INPUT
    cityName = JOptionPane.showInputDialog("Enter city name");
    
    // ------------------------------------------------------- PROCESS & OUTPUT
    
    // 1st) store value returned from method call, 2nd) use that value
    charCount = cityName.length();
    System.out.println(charCount + " characters in " + cityName);
    
    // just use value returned from method call right away
    System.out.println(cityName + " as all caps: " + cityName.toUpperCase());
    System.out.println(cityName + " as all smalls: " + cityName.toLowerCase());
    
    System.out.println("NOTE:  methods did NOT change cityName, see: " +
            cityName);
    
    // -------------------------------------------------------------- "CLEANUP"
    System.exit(0);
   }
}
