/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

/**
 * @author eagyem2
 *
 * This is a main class call Person that has the attribute of name and
 * year of birth
 *
 */
public class Person {

	// We write the attribute of this class
	private String name;
	private int yearOfBirth;

	// We write the constructor for the Person class
	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

    //We declare a getter for the attribute name 
	public String getName() {
		return name;
	}

	// We declare a getter for the attribute year of birth
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	// We write the method toString which print out the person's name and year of
	// birth
	public String toString() {
		String retVal = "\nName: " + getName() + "\nyear Of Birth: " + getYearOfBirth();
		return retVal;
	}
}
