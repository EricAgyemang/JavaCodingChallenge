/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

/**
 * @author eagyem2
 *
 *This is a Student class that extend the person class.
 *This class inherit the attributes of the person class
 */
public class Student extends Person {
	
	// We add an attribute major of this class
    private String major;
	/**
	 * @param name
	 * @param yearOfBirth
	 * Adding a constructors to this class
	 */
	public Student(String name, int yearOfBirth, String major) {
		super(name, yearOfBirth);
		this.major=major;
	}

	
	//Declaring a getter method for the attribute major
	public String getMajor() {
		return major;
	}


    //Declaring the toString method that print out the student's name, year of birth and major
	@Override
	public String toString() {
		//calling the super class's toString();
		String retVal = super.toString();
		retVal+="\nMajor: "+ getMajor();
		return retVal;
	}	
}
