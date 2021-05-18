/**
 * 
 */
package edu.ilstu.it275.lab06.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 This is the sum of odd digit class of an input
 *
 */
public class SumOfOddDigits {

	/**
	 * @param args The main class is declared below
	 */
	public static void main(String[] args) {

		// prompt the user to input in a number
		System.out.println(" e) Enter a number: ");

		// Declaring the scanner class
		Scanner input = new Scanner(System.in);

		// Reading the number input by the user into string variable
		String readNumber = input.nextLine();

		// Declaring and initializing variables for the digits in the number
		int jnum = 0;
		int jsum = 0;

		// We extract the digits of the numbers one by one
		for (int jCount = 0; jCount < readNumber.length(); jCount++) {
			jnum = Integer.parseInt(readNumber.substring(jCount, jCount + 1));

			// We then check to see if the digits that are odd and those even
			if (jnum % 2 != 0) {
				// Then is odd so we add the digit to the other odd
				jsum += jnum;
			}

		}
		System.out.println(" The sum of the odd digits of " + readNumber + " is: " + jsum);
        input.close();
	}

}
