/**
 * Importing appropriate libraries from the java library
 */
package edu.ilstu.it275.lab04.eagyem2;

/**
 * @author eagyem2 This is a class of time difference which helps to compute the
 *         time difference of military time format (0900, 1730)
 */
public class TimeDifference {

	// declaring the variable and initializing it in the class TimeDifference
	int difference;

	// Declaring the constructor of the class
	public TimeDifference(int time1, int time2) {
		// The difference in times is computed as follows
		difference = timeInMinutes(time2) - timeInMinutes(time1);

		// Checking the condition if the difference is less than zero
		if (difference < 0)

			// Then we calculate the difference as follows
			difference = difference + (60 * 24);

	}

	// Declaring the method timeInMunites and returning the appropriate value
	private int timeInMinutes(int time) {
		return (time / 100) * 60 + (time % 100);

	}

	// Declaring the method getHours() and returning appropriate value
	public int getHours() {

		return difference / 60;
	}

	// Declaring the method getMinute() and returning the appropriate value
	public int getMinutes() {
		return difference % 60;

	}

}
