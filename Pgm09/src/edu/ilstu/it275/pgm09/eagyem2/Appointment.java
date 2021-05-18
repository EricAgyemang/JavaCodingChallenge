/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

/**
 * @author eagyem2 
 * This is the Appointment class that has a set of attributes
 * and constructors
 */
public class Appointment {
	private int month;
	private int day;
	private int year;
	private String description;

	// We declare constructors here
	public Appointment(int month, int day, int year, String description) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.description = description;
	}
	// We declare getters and setters for these attributes

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String getDescription() {
		return description;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// We define method occursOn() here
	public boolean occursOn(int month, int day, int year) {
		if (getMonth() == month && getDay() == day && getYear() == year) {
			return true;
		} else {
			return false;
		}
	}

	// We declare a method toString() that convert appointment to string
	public String toString() {

		return description + "on: " + month + "/" + day + "/" + year;
	}
}