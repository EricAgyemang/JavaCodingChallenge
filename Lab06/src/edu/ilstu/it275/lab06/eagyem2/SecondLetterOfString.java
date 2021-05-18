/**
 * 
 */
package edu.ilstu.it275.lab06.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2
 *
 */
public class SecondLetterOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// b) We print out the every second letter of the string
		System.out.println(" b) Enter a string, leave a space and then a -1 to quit. " + "\n"
				+ "Caution: Please make sure to end with the -1: ");

		// Reading in the inputed string
		Scanner input = new Scanner(System.in);
		String observe = input.next();
		String stringPrint = "";

		// We introduce a sentinel value in the while loop to terminate the loop when
		// the user enters a -1
		while (!(observe.equals("-1"))) {
			// We concatenate two position character for the inputed string
			stringPrint += observe.charAt(1) + " ";
			observe = input.next();
		}
		System.out.println("b) Every second letter of the string are: " + stringPrint);
        input.close();
	}

}
