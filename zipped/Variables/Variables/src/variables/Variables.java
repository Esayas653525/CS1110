/* PROJECT:  Variables
 * AUTHOR:  Dr. Kaminski
 * DESCRIPTION:  This demonstrates declaring/using variables and data types.
 * 
 * Two typical styles programmers use for declaring variables:
 *      1) declare ALL variables at the TOP of the program/module
 *          so they're separate from the PROCEDURAL (action) code;
 *      2) declare a variable just before it's used,
 *          integrating the DECLARATION code and the PROCEDURAL code.
 ******************************************************************************/
package variables;

public class Variables {

    public static void main(String[] args) {
       
        //---------------------- INTEGERS --------------------------------------
        
        int age;                    // NOT initialized to a value, but it'd have
                                    //      to be set to a value BEFORE using it
        int zipCode = 49008;        // declare variable & initialize
                                    //      - 49008 is a "literal"
        int sum = 0;                // ALWAYS initialize a running total value
        int x = -100;               // bad naming - what's x for?
        int exam1;                  // can include a digit (but not as 1st char)
        int quizScore;              // declare variable
        quizScore = 89;             //      then assign it a value
                        
        long phone = 2963871000L;   // long is just an integer which allows
                                    //      storing bigger value than int can.
                                    // 10-digit numbers are too big for an int
                                    //      but 9-digits (SSN,WIN) fit in an int
                                    // NOTE the L for the constant value
                                    //      (default, with no L, is an int)
        
        short nQuizes = 7;          // short is just an integer, but saves
                                    //      space if only small values stored
        
        byte numClasses = 4;        // byte is just an integer, but saves
                                    //      space if only tiny values stored
        
                                    // NOTE:    int's take 4 bytes of memory;
                                    //          long's take 8 bytes;
                                    //          short's take 2 bytes;
                                    //          byte's take 1 byte
                                    //   Programmers typically use int,
                                    //   but long if value could be > 9 digits,
                                    //   and short or byte if space is issue
        
        //---------------------- FLOATING POINT NUMBERS ------------------------
 
        double savingsAmt = 349.99; // double is a floating-point number with
        double pi = 3.131592653589; //      double-precision (15 digit accuracy)
                                    //      and greater magnitude for very big
                                    //      or very tiny numbers
        
        float temperature = 98.6F;  // float is a floating-point number with
                                    //      single precision (7-digit accuracy)
                                    // NOTE the F for the constant value
                                    //      (the default is double)
        
        double distFromSun = 1.495979E11;   // E Notation
                                    //      i.e., 1.495979 x 10 to 11 power
                                    //          in Scientific Notation
        
                                    // NOTE:    float's take 4 bytes of memory;
                                    //          double's take 8 bytes                  
                                    //   Programmers TYPICALLY use double,
                                    //   but float if space is big issue
 
        //---------------------- TWO OTHER DATA TYPES --------------------------

        char initial = 'K';
               
        boolean married = false;
        boolean undergrad = true;
        
        //---------------------- USE SOME VARIABLES FROM ABOVE -----------------
        //                                              // + is concantenate
        
        System.out.println("ZipCode:  " + zipCode);
        System.out.println("Distance from the sun:  " + distFromSun);
        
        age = 24;
        System.out.println("Age is " + age);
        System.out.println(age + " years old");
        
        System.out.println("Married? " + married + ", Undergrad? " + undergrad);

        System.out.print("Initial ORIGINALLY was " + initial);
        initial = 'Z';
        System.out.print("; it\'s now been changed to " + initial);
        System.out.println();       // always finish print's with a println
        
        //---------------------- STRING DATA TYPE ------------------------------
        // String is NOT a primitive data type - it's a special CLASS
        
        String college = "Western Michigan University";     // use " not '
        String major;
        major = "Computer Science";
        
        System.out.println(college + " - " + major);
    }
}