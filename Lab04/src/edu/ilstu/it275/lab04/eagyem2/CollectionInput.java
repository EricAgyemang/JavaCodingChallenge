/**
 * 
 */
package edu.ilstu.it275.lab04.eagyem2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author eagyem2 This is a class of collection input that prompt the user for
 *         a measurement in meters and converts it to miles, feet, and inches.
 */
public class CollectionInput {

	/**
	 * @param args this is the main method declared as main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The scanner class
		Scanner input = new Scanner(System.in);

		// printing out a message to the user prompting the user to enter a number in
		// meters
		System.out.println("Enter the measurement in meters: ");

		// the next line method is passed into
		double meters = Double.parseDouble(input.nextLine());

		// closing the input
		input.close();

		// declaring variables
		double miles;
		double feet;
		double inches;

		// Converting values from meters to the declared variables
		// We convert into four decimal places
		NumberFormat numFormat = new DecimalFormat("0.0000");
		miles = meters * 0.000621371;
		feet = meters * 3.28084;
		inches = meters * 39.3701;

		// printing out the results of the user input
		System.out.println("You entered: " + numFormat.format(meters) + " meters. " + "\n"
				+ "Converting to miles, this is: " + numFormat.format(miles) + " miles" + "\n"
				+ "Converting to feet, this is: " + numFormat.format(feet) + " feet" + "\n"
				+ "Converting to inches, this is: " + numFormat.format(inches) + " inches");

	}

}
