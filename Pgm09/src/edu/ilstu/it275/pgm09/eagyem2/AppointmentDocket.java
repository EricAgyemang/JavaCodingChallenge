/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

import java.util.ArrayList;

/**
 * @author eagyem2 
 * this is the Appointment Docket class that gives the detailed
 * information of all appointments
 */
public class AppointmentDocket {

	ArrayList<Appointment> appointments;

//We declare the constructor here
	public AppointmentDocket() {

		appointments = new ArrayList<Appointment>();
	}

//We declare the method addAppointment() here
	public void addAppointment(Appointment aP) {

		appointments.add(aP);

	}

//We declare the method showAll to display all available appointments
	public void showAll() {

		for (Appointment aP : appointments) {

			System.out.println(aP.toString());
		}
	}

//We check for the conditions of the user input
	public void show(int month, int day, int year) {

		for (Appointment aP : appointments) {

			if (aP.occursOn(month, day, year)) {
				System.out.println(aP.toString());
			}
		}
	}
}
