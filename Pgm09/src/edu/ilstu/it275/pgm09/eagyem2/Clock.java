/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

/**
 * @author
 * 
 *         eagyem2 This is the class of Clock that contain the attributes of the
 *         clock
 */
public class Clock {
	private int hours;
	private int minutes;
	protected int alarmMinutes;
	protected int alarmHours;

//We declare the constructors here
	public void setAlarm(int hours, int minutes) {
		alarmHours = hours;
		alarmMinutes = minutes;
	}

	// We declare the getters here
	public int getHours() {
		String s = java.time.Instant.now().toString();
		hours = Integer.parseInt(s.substring(11, 13));
		return hours;
	}

	/**
	 * @return
	 * 
	 * This is the getter for minutes
	 */
	public int getMinutes() {
		String s = java.time.Instant.now().toString();
		minutes = Integer.parseInt(s.substring(14, 16));
		return minutes;
	}

	// This is the getter for time
	public String getTime() {
		String clockTime = getHours() + ":" + getMinutes();
		String alarmTime = alarmHours + ":" + alarmMinutes;

		if (clockTime.compareTo(alarmTime)>= 0) {
			// We clear the alarm
			alarmHours = 9999;
			alarmMinutes = 9999;
			return getHours() + ":" + getMinutes() + " Alarm! Alarm!";
		} else {
			// We return the generated time for the clock
			return getHours() + ":" + getMinutes();
		}
	}
}
