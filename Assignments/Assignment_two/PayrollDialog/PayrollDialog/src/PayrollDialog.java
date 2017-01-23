/* PROJECT:  PayrollDialog
 * AUTHOR:  Gaddis (modified by D.Kaminski)
 * DESCRIPTION:  Calculates final pay amount based on pay rate & hours.
 * CONVERSION ISSUE:
 *      Data entered in a DialogBox's text box will ALWAYS BE String data type.
 *      So, if the program wants NUMERIC type data (e.g., int, double, ...),
 *              then the program has to CONVERT the String variable's data into
 *              to an int (or double or ...) type variable.
 *      NOTE:  Conversion isn't needed when using Scanner class's methods
 *          (e.g., nextInt, nextDouble, ...) since there are separate methods
 *          in that class which can be called to deal with EACH different 
 *          numeric data type - i.e., these methods both get the input data 
 *          from the keyboard (or file) AND convert it.      
 ****************************************************************************/

import javax.swing.JOptionPane;         // This class from the Java library
                                        // needed for GUI/Windows I/O
public class PayrollDialog {

    public static void main(String[] args) {

        // -------------------------------------------------- DECLARE VARIABLES
        String name;                        // IN

        String inputString;                 // IN (generic) for textBox data
        int hours;                          // "IN" (after conversion)
        double payRate;                     // "IN" (after conversion)

        double grossPay;                    // OUT
        
        // -------------------------------------------------------------- INPUT
        name = JOptionPane.showInputDialog("Your name?");

        inputString = JOptionPane.showInputDialog
                            ("Hours worked this week? (round to whole number)");
        hours = Integer.parseInt(inputString);                  // conversion

        inputString = JOptionPane.showInputDialog("Hourly pay rate?");
        payRate = Double.parseDouble(inputString);              // conversion

        // --------------------------------------------------------- PROCESSING
        grossPay = hours * payRate;

        // ------------------------------------------------------------- OUTPUT
        JOptionPane.showMessageDialog(null,
                name + "\'s gross pay this week is $" + grossPay);

        System.exit(0);           // always do this at end of GUI/Windows apps
    }
}
