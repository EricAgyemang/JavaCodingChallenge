/**
 * 
 */
package edu.ilstu.it275.pgm08.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2
 *
 * This is a zip code to bar tester that accepts an input zip code from
 * the user and convert it to a bar code
 *
 */
public class ZipCodeToBarTest {

	/**
	 * @param args
	 * 
	 * This is the main method declared in the zip code to bar test
	 * 
	 */
	public static void main(String[] args) {

		// We declare the scanner class and use it to accept zip code input from the
		// user
		Scanner input = new Scanner(System.in);
		// We print out a message to the user to input in a zip code
		System.out.println("Enter your ZIP code: ");
		int zipCodeInput = Integer.parseInt(input.nextLine());

		// We invoke the zip code to bar code class and use it for our computations
		ZipCodeToBarCode barCodeResult = new ZipCodeToBarCode(zipCodeInput);

		// We print out the final out up of out simulation
		System.out.println("The corresponding bar code for the ZIP code " + zipCodeInput + " is: " + barCodeResult.getBarcode());
		input.close();
	}

}
