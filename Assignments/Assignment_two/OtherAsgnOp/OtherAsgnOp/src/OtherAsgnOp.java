/* PROJECT:  OtherAsgnOp
 * AUTHOR:  Donna Kaminski
 * DESCRIPTION:  This demonstrates several ways to increment a counter:
 *      c = c + 1;      (the normal arithmetic operator & assignment operator)
 *      c += 1;         (the coupound arithmetic/assignment operator)
 *      c++;            (the increment operator)
 * Format #1:  arithmetic op (+ - * / %) & assignment op (=) most versatile.
 *      Used for arithmetic expressions in general.
 *      Variable c is used on BOTH left & right sides of = operator.
 *          It's on right, so it must already have a value.
 *          It's on left, so prior value (if any) will be replaced by new value.
 *      In general, when writing arithmetic expressions,
 *          the variable RECEIVING results (on left)
 *          need NOT actually participate in arithmetic calculation (on right).
 *      Using a variable on both left & right is used for things like:
 *          counters and running totals (e.g., total = total + newScore;)
 *          But in this case, format #2 is generally used.
 * Format #2:  a shorthand version of #1 WHEN
 *          - just doing a single arithmetic operation
 *                  (e.g.,   + 1   OR    + 25  OR   + exam)
 *          - same variable RECEIVES answer & PARTICIPATES in arithmetic
 *      So += useful for counters and running totals.
 *      Similar operators for:     -=     *=     /=    %=
 * Format #3: shorthand way to ADD 1      (MORE LATER)
 *      - useful for counters (but not running totals)
 *      - used in FOR loops (MORE LATER)
 *      There's also a -- operator).
 ****************************************************************************/

import javax.swing.JOptionPane;

public class OtherAsgnOp {

    public static void main(String[] args) {

        // -------------------------------------------------- DECLARE VARIABLES
        String inputString;             // for generic INPUT
        
        int score1;                     // for input after it's converted
        int score2;
        int score3;
        
        int counter = 0;                // for internal calculations
                                        //    must INITIALIZE A COUNTER variable   
        double average;                 // for OUTPUT

        // --------------------------------------------- GET INPUT & KEEP COUNT
        inputString = JOptionPane.showInputDialog("Enter score 1");
        score1 = Integer.parseInt(inputString);
        counter = counter + 1;
        
        inputString = JOptionPane.showInputDialog("Enter score 2");
        score2 = Integer.parseInt(inputString);
        counter += 1;
        
        inputString = JOptionPane.showInputDialog("Enter score 3");
        score3 = Integer.parseInt(inputString);
        counter++;
        
        // -------------------------------------------------- CALCULATE AVERAGE
        average = (double) (score1 + score2 + score3) / counter;
        
        // ------------------------------------------------------ OUTPUT ANSWER
        System.out.println("average of the " + counter + " scores (" + 
                score1 + ", " + score2 + ", " + score3 + ") is " + average);
        
        // ------------------------------------------------------ COMMON ERRORS
        System.out.println("\nBAD AVERAGE #1 (missing parentheses):  " + 
                score1 + score2 + score3 / counter);
        
        System.out.println("\nBAD AVERAGE #2 (still missing parentheses):  " + 
                (score1 + score2 + score3 / counter));
        
        int answer;
        answer = (score1 + score2 + score3) / counter;
        System.out.println("\nBAD AVERAGE #3 (sometimes):  " + answer +
                " using " + score1 + " and " + score2 + " and " + score3);

        // ---------------------------------------------------------- "CLEANUP"
        System.exit(0);
    }
}
