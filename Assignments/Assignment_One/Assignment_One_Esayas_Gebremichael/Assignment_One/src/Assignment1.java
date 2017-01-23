
import javax.swing.JOptionPane;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
/**
 * Lab Section = Wednesday 6:30 PM 
 * Name of Application = RideShare Assignment No = 1 
 * Name of Student = Esayas Gebremichael
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputString;
        int daysPerWkClMt;     //Number of days per week the class meets
        short numTmClaMtPsem;  //Number of times class meet per semester
        double carMilage;      //Car Milage
        double gasPrice;      //gas price per gallon
        int distToPkv;       //Distance to Parkview Campus
        int numOfPerson;     //Number of Passengers

        // Input
        inputString = JOptionPane.showInputDialog("Number of days "
                + "per week class meets ");
        daysPerWkClMt = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog(" Number of times "
                + "class meet per semester ");
        numTmClaMtPsem = Short.parseShort(inputString);

        inputString = JOptionPane.showInputDialog("Car Milage ");
        carMilage = Double.parseDouble(inputString);

        inputString = JOptionPane.showInputDialog("Gas Price per gallon ");
        gasPrice = Double.parseDouble(inputString);

        inputString = JOptionPane.showInputDialog("Distance to "
                + "Parkview Campus ");
        distToPkv = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog("Number of Passengers ");
        numOfPerson = Integer.parseInt(inputString);

        //Processing
        // calculate total number of times  class meet
        int totalNumTmClaMtPsem = daysPerWkClMt * numTmClaMtPsem;

        // calculate total round trip distance
        int roundTripDist = distToPkv * 2;

        // cost for one round-trip (for gas)
        double costForOneTrip = (((roundTripDist) / carMilage) * gasPrice);

        //Total number of Driven Distance per semester
        int totalDrDistPersem = roundTripDist * totalNumTmClaMtPsem;

        // Number of gallons used per semester
        int NumGalPersem = (int) ((totalDrDistPersem) / (carMilage));

        // Semester expense per number of passengers
        double totalCost = (NumGalPersem * gasPrice) / (numOfPerson);

        //Output
        JOptionPane.showMessageDialog(null, "Number of round "
                + "trips/semester  : " + roundTripDist + "\nTotal number of "
                + "miles/semester  : " + totalDrDistPersem
                + String.format("\nCost for 1 " + "roundtrip (for gas) :  $%.2f",
                        costForOneTrip) + String.format("\nThe total cost "
                        + "for " + numOfPerson + " passenger/s"
                        + " for the semester:  $%.2f", totalCost));
        System.exit(0);

    }

}
