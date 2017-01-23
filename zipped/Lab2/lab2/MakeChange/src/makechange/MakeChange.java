/* PROJECT:  MakeChange
 * AUTHOR:  Dr. Kaminski with modifications by: ____________________________ 
 * DESCRIPTION:  This program calculates the change owed to a customer in terms
 *          of how many of each bill and coin.
 *      INPUT (Dialog Boxes):  customer's total bill & amount customer paid
 *          [NOTE:  Customer may pay an uneven amount like $20.48]
 *      OUTPUT (Console):  (SEE SAMPLE BELOW IN OUTPUT SECTION COMMENT)
 *          total amount of change as a single number
 *          and this amount broken down into the number of:
 *                  $20 bills, $10's, $5's, $1's,
 *                  quarters, dimes, nickels, pennies
 *          with preference given to the largest bills/coins possible.
 *          [NOTE:  Assume max possible paid is $50]
 * HELP:  / does integer divide (if both operands are integer variables/values)
 *              and returns the QUOTIENT
 *        % does integer divide and returns the REMAINDER
 *        --- leftOver amount can REPEATEDLY reused
 *        --- sometimes you want to divide the INITIAL amount,
 *                  and sometimes you want to divide the leftOver amount
 *---------------------------------------------------------------------------*/
package makechange;
//import javax.swing.JOptionPane;

public class MakeChange {

    public static void main(String[] args) {
        // -------------------------------------------------- DECLARE VARIABLES
        //                                          for INPUT
        // CODE GOES HERE >>>
        double theBill = 3.47;
        double custPaid = 50;

        //                                          for OUTPUT
        // CODE GOES HERE >>>
        int billsIn20, billsIn10, billsIn5, billsIn1, quarters, dimes, nickels, pennies;

        //                                          for INTERMEDIATE RESULTS
        double actualChange = custPaid - theBill;
        int changeInPennies = (int) Math.round(actualChange * 100);
        int leftOver;                       // use this repeatedly in calc's

        // -------------------------------------------------------------- INPUT
        // STAGES OF TESTING:
        // 1) HARDCODE 2 input values instead of asking user.
        // 2) Change hardcoded values to something else to test that those work
        //          right too.
        // 3) Change this section to ask user for the 2 values.
//        theBill = 3.47;                   // UNCOMMENT THESE 2 LINES WHEN
//        custPaid = 10.00;                 //      READY TO RUN TEST STAGE 1
        // ------------------------------------------------------- CALCULATIONS
        // 1st) Calculate actual change amount
        // CODE GOES HERE >>>
        //changeInPennies = (int) Math.round(actualChange * 100);
        // 2nd) determine the 8 individual numbers of bills and coins
        billsIn20 = changeInPennies / 2000;
        leftOver = changeInPennies % 2000;

        billsIn10 = leftOver / 1000;
        leftOver = leftOver % 1000;

        billsIn5 = leftOver / 500;
        leftOver = leftOver % 500;

        billsIn1 = leftOver / 100;
        leftOver = leftOver % 100;

        quarters = leftOver / 25;
        leftOver = leftOver % 25;

        dimes = leftOver / 10;
        leftOver = leftOver % 10;

        nickels = leftOver / 5;
        leftOver = leftOver % 5;

        pennies = leftOver;

        //leftOver = leftOver %
        // CODE GOES HERE >>>
        // ------------------------------------------------------------- OUTPUT
        // OUTPUT LOOKS LIKE THIS (fix some things later with printf):
        /*
            Bill is $3.47 and customer paid $10.0
            Change back to customer is 6.529999999999999 (= 653 in pennies)
            GIVE CUSTOMER THESE BILLS AND COINS:
                    0 twenty dollar bills
                    0 ten dollar bills
                    1 five dollar bills
                    1 dollar bills
                    2 quarters
                    0 dimes
                    0 nickels
                    3 pennies
         */
        // CODE GOES HERE >>>
        System.out.printf("\n%d twenty dollar bills", billsIn20);
        System.out.printf("\n%d ten dollar bills", billsIn10);
        System.out.printf("\n%d five dollar bills", billsIn5);
        System.out.printf("\n%d dollar bills", billsIn1);
        System.out.printf("\n%d quarters", quarters);
        System.out.printf("\n%d dimes", dimes);
        System.out.printf("\n%d nickles", nickels);
        System.out.printf("\n%d pennies", pennies);




        System.out.println("\n\nEND OF CHANGE CALCULATIONS");
        //---------------------------------------------------------- "CLEAN UP"
        System.exit(0);
    }
}
