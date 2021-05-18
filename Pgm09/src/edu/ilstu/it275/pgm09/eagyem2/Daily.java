/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

/**
 * @author eagyem2 
 * This is a Daily class that inherits the appointment class
 */
public class Daily extends Appointment {

	public Daily(int month, int day, int year, String description) {
		super(month, day, year, description);
	}

	// We use the if else condition to check all possible conditions
	public boolean occursOn(int month, int day, int year) {
		if (year >= getYear()) {
			return true;
		} else if (month >= getMonth()) {
			return true;
		} else if (day >= getDay()) {
			return true;
		} else {
			return false;
		}
	}

}
