/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 
 * This is the class of Appointment Tester for the first part of
 *  the question. However I strive to do both parts together in the other
 *  tester class too
 */
public class AppointmentTesterForPart1 {
	/**
	 * @param args 
	 * This is the main class
	 */
	public static void main(String[] args) {
		// We invoke the appointment class here
		Appointment[] appointments = new Appointment[3];
		// We fill an array of Appointment objects with a mixture of appointments
		appointments[0] = new Daily(4, 10, 2021, "brush of teeth is  ");

		appointments[1] = new Monthly(4, 30, 2022, "Paediatrics attendants is ");

		appointments[2] = new OneTime(7, 8, 2023, "Review for checkups on heart surgur is ");

		// We print out a message to the user to direct him for usage
		System.out.println("Please enter a date (Month, Day, Year) to list all appointments avaialble: ");

		// The scanner class is used here to accept input from the user
		Scanner input = new Scanner(System.in);

		// We read in the month, day and year from the user
		System.out.println("Enter the month: ");
		int month = Math.abs(input.nextInt());

		System.out.println("Enter the day: ");
		int day = Math.abs(input.nextInt());

		System.out.println("Enter the year: ");
		int year = Math.abs(input.nextInt());

		// We check for the conditions from the user input
		for (int i = 0; i < appointments.length; i++) {
			if (appointments[i].occursOn(month, day, year)) {
				System.out.println("Your appointnment for " + appointments[i].toString());
			} else {
				System.out.println("No appointment for other dates");
			}

		}
		input.close();

	}

}
