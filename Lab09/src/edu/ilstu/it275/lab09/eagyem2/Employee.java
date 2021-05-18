/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

import java.text.NumberFormat;

/**
 * @author eagyem2
 *
 * This is the main class called Employee class with attributes from which other classes
 * inherit
 */
public class Employee {

	// We write the attributes of this class
	private String name;
	private double salary;

	// Writing constructors
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Declaring getters for the attributes to be accessible
	// getter for the attribute name
	public String getName() {
		return name;
	}

	// Getter for the salary is declared
	public double getSalary() {
		return salary;
	}

	// This is the toString method that returns the name and salary of the employee
	public String toString() {
		NumberFormat form = NumberFormat.getCurrencyInstance();
		String retVal = "\nName: " + getName() + "\nSalary: " + form.format(getSalary());
		return retVal;
	}

}
