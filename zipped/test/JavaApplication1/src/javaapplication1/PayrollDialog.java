/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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