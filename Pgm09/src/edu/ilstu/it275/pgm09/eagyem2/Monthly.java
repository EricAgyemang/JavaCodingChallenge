/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

/**
 * @author eagyem2
 *  This is the class of Monthly that describe the monthly
 *  appointment. It extends the Appointment class
 */
public class Monthly extends Appointment {

	// We declare the constructors here
	public Monthly(int month, int day, int year, String description) {
		super(month, day, year, description);
	}

	// We check all available conditions of the problem here
	public boolean occursOn(int month, int day, int year) {
		if (year < getYear()) {
			return false;
		} else if (month < getMonth() && year == getYear()) {
			return false;
		} else {
			return true;
		}

	}

}
