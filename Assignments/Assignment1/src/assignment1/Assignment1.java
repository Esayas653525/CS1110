/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**Lab Section = Wednesday 6:30 PM
 *Name of Application = RideShare
 * Assignment No = 1
 * @author Esayas Gebremichael
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte daysPerWkClMt = 3;     //Number of days per week the class meets
        short numTmClaMtPsem = 15;  //Number of times class meet per semester
        double CarMilage = 18;
        double gasPrice = 2.12;
        int distToPkv = 23;       //Distance to Parkview
        
        System.out.println("GIVEN THIS DATA");
        System.out.println("Class info:");
        System.out.println("\tnumber days/week class meets: 3");
        System.out.println("\tnumber of weeks in semester: 15");
        System.out.println("Gas info:");
        System.out.println("\tcar's average mpg: 18 miles");
        System.out.println("\tprice of gas per gallon: $2.12");
        System.out.println("Journey info:");
        System.out.println("\t1-way distance to Parkview: 23 miles\n");
        
        // step 1: calculate total number of times  class meet
        int totalNumTmClaMtPsem= daysPerWkClMt * numTmClaMtPsem;
                  
        // step 2: calculate total rond trip distance
        int roundTripDist = distToPkv * 2;
        double costForOneTrip = (((roundTripDist)/CarMilage)* gasPrice);
        
        //Total number of Driven Distance per semester
        int totalDrDistPersem = roundTripDist * totalNumTmClaMtPsem;
        int NumGalPersem = (int) ((totalDrDistPersem)/(CarMilage));
        double totalCost = (NumGalPersem * gasPrice);
        double onePerson = (double)totalCost;
        double twoPerson = (double) (totalCost/2);
        double threePerson = (double)(totalCost/3);
//        System.out.println();
        System.out.println("THE RESULTS");
        System.out.println("Number of round trips/semester: " + totalNumTmClaMtPsem);
        System.out.println("Total number of miles/semester: " + totalDrDistPersem);
        System.out.printf("Cost for 1 round-trip (for gas): $%.2f\n", costForOneTrip);
        System.out.printf("Total cost for semester (for gas): $%.2f\n", totalCost);
        System.out.println();
        System.out.println("Cost per person for the semester");
        System.out.printf("For 1 Person: $%.2f\n", onePerson);
        System.out.printf("For 2 people sharing: $%.2f\n", twoPerson);
        System.out.printf("For 3 people sharing: $%.2f\n", threePerson);
        
        
        
        
        
        
    }
    
}
