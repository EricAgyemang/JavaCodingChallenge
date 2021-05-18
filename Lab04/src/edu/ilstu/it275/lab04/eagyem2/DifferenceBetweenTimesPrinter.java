/**
 * Importing the appropriate libraries from java library
 */
package edu.ilstu.it275.lab04.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 This is a class of Difference Between Time Printer which
 *         helps to prompt the user for two times in military format (0900.
 *         1730)
 */
public class DifferenceBetweenTimesPrinter {

	/**
	 * @param args The main class is declared as main below
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We declare the object Scanner class
		Scanner input = new Scanner(System.in);

		// prompt the user to enter the first time
		System.out.println("Enter the first time: ");

		// input the time value
		int time1 = Integer.parseInt(input.nextLine());

		// prompt the user to enter the second time
		System.out.println("Enter the second time: ");

		// input the time value
		int time2 = Integer.parseInt(input.nextLine());

		// Closing the input statement
		input.close();

		// Declaring the the object time interval of the class
		TimeDifference timeInterval = new TimeDifference(time1, time2);

		// Display the statement on the console to print out the require time difference
		System.out.println("The number of hours and minutes between the two times provided are: "
				+ timeInterval.getHours() + " hours " + timeInterval.getMinutes() + " minutes ");

	}

}
