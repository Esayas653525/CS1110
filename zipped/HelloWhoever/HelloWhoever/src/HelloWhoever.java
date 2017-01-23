/* PROJECT:  HelloWhoever
 * AUTHOR:  Dr. Kaminski
 * DESCRIPTION:  Program gets user's name to use in display message.
 ****************************************************************************/

import java.util.Scanner;           // This class needed from the Java library

public class HelloWhoever {
    
    public static void main(String[] args) {

        String name;                        // variable to store user's name

        Scanner keyboard = new Scanner(System.in);      // setup object

        System.out.print("What is your name?  ");       // prompt user
        name = keyboard.nextLine();                     // get answer

        System.out.println("Hello " + name);             // write message
    }
}
