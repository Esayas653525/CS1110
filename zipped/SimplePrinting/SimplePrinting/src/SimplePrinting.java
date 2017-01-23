/* PROJECT:  SimplePrinting
 * AUTHOR:  Dr. Kaminski
 * DESCRIPTION:  Shows print & println methods & several escape sequences.
 *      System.out. sends the display to the Output window.
 *      - print leaves the cursor after what's just printed
 *      - println adds a CARRIAGE-RETURN & LINEFEED after the printing.
 ****************************************************************************/

public class SimplePrinting {

    public static void main(String[] args) {

        System.out.print("HELLO");
        System.out.println("First line");
        System.out.println("Second line");
        
        System.out.println();                   // does a blank line
        System.out.println("");                 // also does a blank line
                                                //      (an empty string)        
        System.out.print("Computer  ");
        System.out.print("Science");
        System.out.println(" - Finally the LINEFEED");
        
        System.out.println("A line with extra linefeeds.\n\n");
        
        System.out.println("    (3 altogether, including the ln part)");
        
        System.out.println("Here\'s a tab\t(& the escape sequence for a \')");
        System.out.println("    (NOTE: the backslash itself doesn't print)");
        
        System.out.println("A line with an embedded \n\tlinefeed & tab.");
        
        System.out.println("\n\nThis very, very, long line did not fit on" +
                " 1 code-line, so I concatenated 2 strings.");
    }
}
