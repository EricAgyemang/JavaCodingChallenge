/**
 * 
 */
package edu.ilstu.it275.lab05.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 This is a compass class that has a needle points a given
 *         number of degrees away from north measured clockwise.
 */
public class Compass {

	/**
	 * @param args The main method is define as main
	 */
	public static void main(String[] args) {


		// Declaring a double variable which is the degree of the angles measured in this main method
		double degrees = 0;

		// Create an instance of a Scanner class
		Scanner input = new Scanner(System.in);

		// Allowing the user to enter a number of degrees from the North
		System.out.println("Enter an angle in degrees between 0 and 360 starting from the North: ");

		// Here we prompt for the number of degrees
		degrees = input.nextDouble();

		// If degree is greater 0 and if it is less than 45
		// we print out NE
		if (degrees > 0 && degrees < 45) {
			System.out.println("NE");

			// If degrees is greater than 45 and less than or equal 80, print out E
		} else if (degrees > 45 && degrees < 90 || degrees == 90) {
			System.out.println("E");

			// if degrees is greater than 90 and less than 135, we print SE
		} else if (degrees > 90 && degrees < 135) {
			System.out.println("SE");

			// If degrees is greater than 135 and less than 180 or is equal to 180, print
			// out S
		} else if (degrees > 135 && degrees < 180 || degrees == 180) {
			System.out.println("S");

			// If degrees is greater than 180 and is less than 225, print out SW
		} else if (degrees > 180 && degrees < 225) {
			System.out.println("SW");

			// If degrees is greater than 225 and is less than 270 or is equal to 270, print
			// out W
		} else if (degrees > 225 && degrees < 270 || degrees == 270) {
			System.out.println("W");

			// If degrees is greater than 270 and if is less than 315, print out NW
		} else if (degrees > 270 && degrees < 315) {
			System.out.println("NW");

			// if degrees is greater than 315 and if is less than or equal to 360 or degrees
			// is equal to 0
			// print out N
		} else if (degrees > 315 && degrees <= 360 || degrees == 0) {
			System.out.println("N");

			// if degrees fall outside the range of 0 - 360, then
		} else {
			System.out.println(
					"Error" + "\n" + "Please the degree you entered fall outside the range of 0 - 360 degrees");
		}
		input.close();
	}

}
