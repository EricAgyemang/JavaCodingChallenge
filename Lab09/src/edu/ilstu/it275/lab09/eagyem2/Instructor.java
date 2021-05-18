/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

import java.text.NumberFormat;

/**
 * @author eagyem2
 *
 * This is an Instructor class that extends the person class. this class
 * inherit all the attributes of the person class and add up the
 * attribute of salary
 */
public class Instructor extends Person {

	// We add an attribute salary of this class
	private double salary;

	/**
	 * @param name
	 * @param
	 * 
	 * yearOfBirth We declare the constructors of this class
	 */
	public Instructor(String name, int yearOfBirth, double salary) {
		super(name, yearOfBirth);
		this.salary = salary;
	}

	// We declare the getter for the attribute salary
	public double getSalary() {
		return salary;
	}

	// This is the toString method that print out the name, year of birth and the
	// salary
	@Override
	public String toString() {
		NumberFormat form = NumberFormat.getCurrencyInstance();
		// calling the super class's toString();
		String myString = super.toString();
		myString += "\nSalary: " + form.format(getSalary()) + " per month";
		return myString;
	}
}
