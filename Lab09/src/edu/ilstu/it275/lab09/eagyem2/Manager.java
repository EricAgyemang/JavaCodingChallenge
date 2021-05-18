/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

/**
 * @author eagyem2
 *
 * This is a manager class that extends the Employee class for the
 * inheritance This class inherits all attributes of the Employee class
 * and add up the attribute department
 */
public class Manager extends Employee {

	// Adding the instance variables to this class
	private String department;

	/**
	 * @param name
	 * @param salary
	 * 
	 * Declaring the constructors of this class
	 */
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}

	// Declaring getter for the attribute department
	public String getDepartment() {
		return department;
	}

	// This is the toString method that print out the manager's name, salary and the
	// department
	public String toString() {

		// calling the super class's toString();
		String retVal = super.toString();
		retVal += "\nDepartment: " + getDepartment();
		return retVal;
	}

}
