/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

/**
 * @author eagyem2
 *
 *This is Executive class that extends the Manager class for the inheritance
 *This class has the attributes name, salary and department as it inherit from the Manager class
 */
public class Executive extends Manager {

	/**
	 * @param name
	 * @param salary
	 * @param department
	 * 
	 * We declare the constructor for this class 
	 */
	public Executive(String name, double salary, String department) {
		super(name, salary, department);	
	}

	// This is the toString method that returns the employee's name, salary, and department.
	public String toString() {
		String retVal = super.toString();
		return retVal;
	}
}
