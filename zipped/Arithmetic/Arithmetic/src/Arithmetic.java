/* PROJECT:  Arithmetic
 * AUTHOR:  Dr. Kaminski
 * DESCRIPTION:  This demonstrates:
 * 1 - FIVE ARITHMETIC OPERATORS (5 BINARY operators:  + - * / %)
 *      - and * work as expected.
 *      + is an OVERLOADED operator (i.e., it has several meanings):
 *              It's ADD if the 2 operands are numeric (variables or constants).
 *              It's CONCATENATE if one/both operands are String type. 
 *      / is an OVERLOADED operator (sort of):
 *              It gives INTEGER result if both operands are integer types
 *                      AND result is TRUNCATED, NOT ROUNDED.
 *                  [NOTE:  Even if ANSWER variable is a float or double,
 *                      you still get an INTEGER answer for 2 integer operands].
 *                  [NOTE:  integer data types include int, short, long, byte].
 *              It gives a FLOATING POINT NUMBER answer if one/both operands are
 *                      float (or double) data type
 *                      AND result variable is a float (or double).
 *              [NOTE:  You can FORCE / to be a floating point divide even with
 *                  integer operands by CASTING 1 operand to a float or double.
 *      % is MOD operator, i.e., INTEGER REMAINDER after doing INTEGER DIVIDE.
 *              (EXAMPLE:  Use it to test if an integer is ODD or EVEN).
 *
 * 2 - CASTING = forcing an integer type to act as a floating point number type
 *
 * 3 - ORDER of PRECEDENCE:
 *          highest priority:  UNARY -
 *          next priority:     *  /  %  (of equal priority, from left to right)
 *          lowest priority:   +  -     (of equal priority, from left to right)
 *      ( ) can be used to change these priorities.
 *      Order or precedence for = (binary operator) (i.e., assignment operator)
 *              relative to arithmetic operators is LOWEST PRIORITY.
 *              So arithmetic on right side gets done BEFORE final answer
 *                      is stored in left-side answer variable.
 *
 * NOTE:  Must DECLARE a variable before using it.
 * NOTE:  Left side of = operator MUST be a single variable
 *              (of correct data type - i.e., numeric, if doing arithmetic).
 *        Right side of = may contain numeric variables & numeric constants.
 *
 * CAVEAT:  This is a poor way to write a program, with one LONG LONG method.
 *      I used a simplistic way of MODULARIZING, by adding physical dividers.
 *      But it'd be much better to MODULARIZE into separate (NAMED) METHODS, 
 *      then CALL those methods when needed.  Demo programs will start doing 
 *      this once we cover methods and method-calling.
 ******************************************************************************/

public class Arithmetic {
    
    public static void main(String[] args) {
            //                      These 1st two calculations do:
            //                      1) do calculation & STORE RESULT in answer
            //                      2) then USE the STORED answer afterwards
            int answer;

            System.out.println("ORDER OF PRECEDENCE");
            
            answer = 2 + 4 * 10;                    
            System.out.println("2 + 4 * 10 is " + answer);

            answer = (2 + 4) * 10;
            System.out.println("(2 + 4) * 10 is " + answer);

            //*****************************************************************
            //                      These next calculations do:
            //                      1) calculate answer & USE IT IMMEDIATELY
            //                              without storing it
            System.out.println("1000 / 100 * 4 is " + (1000 / 100 * 4));

            System.out.println("1000 / (100 * 4) is " + (1000 / (100 * 4)));

            //*****************************************************************
            //                      INTEGER DIVIDE vs. FLOATING POINT DIVIDE
            System.out.println("\n2 TYPES OF DIVIDE");
            
            System.out.println("7 / 2 is " + (7 / 2) + " (integer divide)");

            System.out.println("6 / 2 is " + (6 / 2) + " (integer divide)");
            
            System.out.println();
            System.out.println("7.0 / 2.0 is " + (7.0 / 2.0) +
                    " (floating-point divide)");
            System.out.println("7 / 2.0 is " + (7 / 2.0));
            System.out.println("7.0 / 2 is " + (7.0 / 2));

            System.out.println("\n7 % 2 is " + (7 % 2) + " (so it is ODD)");

            System.out.println("6 % 2 is " + (6 % 2) + " (so it is EVEN)");
                        
            //*****************************************************************
            //                                  CASTING (& re-using a variable)
            System.out.println("\nCASTING");

            double floatAns;
            floatAns = 10 / 3;
            System.out.println("floatAnswer for 10 / 3 gives: " + floatAns);
            
            floatAns = (double) 10 / 3;
            System.out.println("\tcast 10 to double - gives: " + floatAns);
          
            floatAns = 10 / (double) 3;
            System.out.println("\tcast 3 to double - gives: " + floatAns);
          
            floatAns = (double) 10 / (double) 3;
            System.out.println("\tcast both to double - gives: " + floatAns);

            floatAns = (double) (10 / 3);
            System.out.println("\tcast result to double - gives: " + floatAns);
            
            //*****************************************************************
            //                                  PRINTING ONLY 2 DECIMAL PLACES
            //                                  using printf & formatter
            System.out.println("\nPRINTING ONLY 2 DECIMAL PLACES");
            
            floatAns = 10.0 / 6;
            
            System.out.println("\t10.0 / 6 is " + floatAns);
            
            System.out.printf("\tbut with formatting it is %.2f", floatAns);
            System.out.println();
            
            //*****************************************************************
            //                          + IS OVERLOADED OPERATOR - IT'S:
            //                            "ADD" FOR 2 NUMERIC OPERANDS,
            //                            "CONCATENATE" IF 1 IS A STRING OPERAND

            System.out.println("\nADD vs. CONCANTENATE");
            
            System.out.println("24 + 45 (+ is \"concatenate\"): " + 24 + 45);
            System.out.println("(24 + 45) (+ is \"add\"): " + (24 + 45));

            int someNumber = 123456789;
            System.out.println("Here is someNumber: " + someNumber);
            System.out.println(someNumber + " - that was someNumber");
            System.out.println(someNumber + someNumber +
                    " - those were 2 numbers ADDED together");          
    }
}
