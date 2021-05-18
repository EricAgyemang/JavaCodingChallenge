/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 
 * 
 * This is a class of Test appointment that test the
 *         appointments of the user input
 */
public class TestAppointment {
	/**
	 * The main method is declared as main
	 * 
	 */
	public static void main(String[] args) {
		// Explicitly initializing the attributes
		int day = 0;
		int year = 0;
		int month = 0;
		int appointmentType = 0;
		String description = "";
		String inputAppointment = "";

		// We put in the array of appointments
		AppointmentDocket appointmentsAvaialable = new AppointmentDocket();

		appointmentsAvaialable.addAppointment(new Monthly(4, 30, 2022, "Paediatrics attendants is "));

		appointmentsAvaialable.addAppointment(new Daily(4, 10, 2021, "brush of teeth is "));

		appointmentsAvaialable.addAppointment(new OneTime(7, 8, 2023, "Review for checkups on heart surgur is "));

		// We call for the appointment class
		Appointment appointment;
		Scanner input = new Scanner(System.in);

		// Checking the input of the user if true
		while (true) {

			// Display a message to the user to guide his/her input decision
			System.out.println("Do you want to display your available appointments ? Enter  y for yes and n for No: ");

			inputAppointment = input.next();

			if (!inputAppointment.equalsIgnoreCase("y")) {

				break;
			}
			else {

				while (true) {

					// We ask the user to chose from the available appointments
					System.out
							.println("What time of appointment do you want to display? choose a number from below:\n");
					System.out.println("1. One time");

					System.out.println("2. Daily");

					System.out.println("3. Monthly");

					System.out.println("Choose appointment type: ");

					appointmentType = input.nextInt();

					if (appointmentType >= 1 && appointmentType <= 3) {

						break;

					}

					// We ask the user to enter the description of appointment to add
					input.nextLine();

					System.out.println("Enter description: ");

					description = input.nextLine();

					month = input.nextInt();
					System.out.println("Enter month: ");

					day = input.nextInt();
					System.out.println("Enter day: ");

					year = input.nextInt();
					System.out.println("Enter year: ");

					appointmentType = input.nextInt();
					System.out.println("Choose appointment type: ");

					// We check the condition of the user's input
					if (appointmentType == 1) {

						appointment = new OneTime(month, day, year, description);

					} else if (appointmentType == 2) {

						appointment = new Daily(month, day, year, description);

					} else {

						appointment = new Monthly(month, day, year, description);

						appointmentsAvaialable.addAppointment(appointment);

					}

				}
				// We display the set of appointments in the user input
				System.out.println("\nThe appointments in the book are: ");

				appointmentsAvaialable.showAll();

				System.out.println("Enter day: ");

				day = input.nextInt();

				System.out.println("Enter month: ");

				month = input.nextInt();

				System.out.println("Enter year: ");

				year = input.nextInt();

				appointmentsAvaialable.show(day, month, year);
			}

		}
		input.close();
	}
}