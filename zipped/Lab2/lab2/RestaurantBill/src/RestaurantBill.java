/* PROJECT: RestaurantBill
 * AUTHOR:  Dr. Kaminski - amended by _____________________________________
 * DESCRIPTION:  Calculates final amount to pay based on items on the bill plus
 *              tax and tip.  Shows total for 3 possible tip %'s.
 *      INPUT (Dialog boxes):  entree price, drink price, desert price
 *      OUTPUT (Console or Output Window):
 *          total price for each of 3 tip values:  10%, 15%, 20%
 *          plus a summary of the input values & intermediate price summaries
 *              [SEE COMMENT BELOW UNDER "PRINT OUTPUT"]
 * ASSUMPTION:  Tip is applied AFTER tax is added.
 * SUGGESTION FOR INCREMENTAL DEVELOPMENT:
 *      1) Run program as is before making any additions - SEE, IT RUNS, BUT...
 *      2) Add code for user input declarations - make sure it still runs
 *      3) Do stage 1 of input testing - i.e., HARD-CODED INPUT - see comments
 *              in input section below *          
 *      4) Add code for outputting, though most values will still just be 0's
 *              since that's what you initialized them as in the declarations
 *              section - run it & check results
 *      5) Add code to do tax calculations part - run it & check results
 *      6) Fix output formatting so numbers appear with 2 decimal places
 *      7) Add calculations for the 10% tip - run it & check results
 *      8) Add the other 2 tip levels - run it & check results
 *      9) Do stage 2 of input testing - i.e., HARD-CODED INPUT with DIFFERENT
 *          values - run it & check results
 *      10) Do stage 3 of input testing - i.e., get actual values from user
 *          - run it & check results  
 *****************************************************************************/
import javax.swing.JOptionPane;

public class RestaurantBill {

    public static void main(String[] args) {
        
          
        
        //-------------------------------------------------------- DECLARATIONS
        // declare 4 constants for:
        //      MI_TAX (which is 6%),
        //      LOW_TIP, AVE_TIP, GOOD_TIP (10%, 15%, 20% respectively)
        
        double MI_TAX = 0.06;
        double LOW_TIP = 0.01;
        double AVE_TIP = 0.15;
        double GOOD_TIP = 0.20;
        //double priceOne = 0;
        //double priceTwo = 0;
        //double priceThree = 0;
       
        //String entreePrice = JOptionPane.showInputDialog("entree price");
        //String drinkPrice = JOptionPane.showInputDialog("drink price");
        // String desertPrice = JOptionpane.showInputDialog("desert price");
        
        // WRITE CODE HERE
        double priceOne = 0;
        double priceTwo = 0;
        double priceThree = 0;
        double itemsTotal = 0;
        double totalWithTax = 0;
        double totalWith10PC = 0;
        double totalWith15PC = 0;
        double totalwith20PC = 0;
        
        priceOne = 9.99;
        priceTwo = 4.50;
        priceThree = 4.98;
        
        itemsTotal = priceOne + priceTwo + priceThree;
        totalWithTax = itemsTotal + ((double)MI_TAX/100)*itemsTotal;
        totalWith10PC = totalWithTax + LOW_TIP * totalWithTax;
               
                
        System.out.println("Items total without tax " + itemsTotal);
        System.out.printf ("Items total with tax %.2f", totalWithTax);
        System.out.printf("/nItems total with tax + 10%% tip is %.2f", totalWith10PC);
        // declare variables (and initialize them appropriately) for:
        //          the 3 input prices, the generic userData (String),
        //          itemsTotal, totalWithTax,
        //          totalWith10PC, totalWith15PC, totalWith20PC
        
        // WRITE CODE HERE
        
        
        
        
        
        //----------------------------------------------------------- GET INPUT
        // STAGES OF TESTING:
        // 1) just HARD-CODED input, like 9.99, 4.50, 4.98 for the 3 prices
        //      rather than asking user for input - then run it & check results
        // 2) try different hard-coded values, run it, check results
        // 3) FINAL VERSION:  ask user for 3 input values, run it, check results
        
        // WRITE CODE HERE
        
        
        
        
        
        //----------------------------------------------------- DO CALCULATIONS
        
        // WRITE CODE HERE
        
        
        
        
        //------------------------------------------------------- PRINT OUTPUT
        // Things to print, appropriately labelled, nicely formatted:
        // - the 3 items purchased (entree, drink, desert) with their prices 
        // - total price (appropriately labelled):
        //         before tax
        //         with tax included
        //         with tax & low (10%) tip
        //         with tax & average (15%) tip
        //         with tax & good (20%) tip
        // HOW TO:  make double variables print with just 2 decimal places:
        //      - use printf rather than print or println
        //      - try un-commenting these these 3 lines:
//        double pi = 3.14159265359;
//        System.out.println("pi printed as stored:  " + pi);
//        System.out.printf("pi printed with 2 decimal places:  %.2f\n", pi);
        
        // WRITE CODE HERE
        
        
        
        
        
        //---------------------------------------------------------- "CLEAN UP"
        System.exit(0);
    }   
}
