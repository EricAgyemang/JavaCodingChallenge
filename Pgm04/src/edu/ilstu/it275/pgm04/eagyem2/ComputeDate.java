/**
 * 
 */
package edu.ilstu.it275.pgm04.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 This is a class of Compute Date which prompt the user for a
 *         year and prints the month and day of Easter Sunday.
 *
 */
public class ComputeDate {

	/**
	 * @param args The main method is declared as main below
	 */
	public static void main(String[] args) {
	
		// Declaring and initializing the variable year in the main method
		int year = 0;

		// Create an instance of a Scanner class for this work
		Scanner input = new Scanner(System.in);

		// Allow users to enter the year
		System.out.print("Please enter year to compute month and day of Easter Sunday" + "\n"
				+ "Any negative year enterd will be converted in absolute value terms for the computation: ");
		// Read in the user's year entered
		year = input.nextInt();

		// We calculate the values of variables which will be used to compute the Easter
		// Sunday
		int a = Math.abs(year) % 19;

		int b = Math.abs(year) / 100;

		int c = Math.abs(year) % 100;

		int d = b / 4;

		int e = b % 4;

		int j = c / 4;

		int k = c % 4;

		int g = (8 * b + 13) / 25;

		int h = (19 * a + b - d - g + 15) % 30;

		int m = (a + 11 * h) / 319;

		int r = (2 * e + 2 * j - k - h + m + 32) % 7;

		int n = (h - m + r + 90) / 25;

		int p = (h - m + r + n + 19) % 32;

		// printing out the value p and n for the results.
		System.out.println("The Easter Sunday for the year " + year + " in absolute value terms falls on day " + p
				+ " of month " + n);
        input.close();
	}

}
