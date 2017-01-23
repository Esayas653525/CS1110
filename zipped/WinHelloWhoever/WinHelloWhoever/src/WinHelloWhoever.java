/* PROJECT:  WinHelloWhoever
 * AUTHOR:  Dr. Kaminski
 * DESCRIPTION:  Program gets user's name from a DialogBox window (which 
 *      includes a prompt), then displays Hello message with user's name to a
 *      a MessageBox window.
 ****************************************************************************/

import javax.swing.JOptionPane;        // Need this class from library to do GUI

public class WinHelloWhoever {
    
    public static void main(String[] args) {

        String name;                        // variable to store user's name

                                            // prompt user & get answer
                                            //      using a Dialog Box
        name = JOptionPane.showInputDialog("What is your name?");

                                            // show message in Message Box
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        System.exit(0);                     // needed for GUI Windows programs
    }
}
