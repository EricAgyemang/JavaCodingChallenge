/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of person testing that test all classes inheriting
 * the person class and the person class it self
 */
public class PersonTesting {

	/**
	 * @param args
	 * 
	 * The main method is declared as main
	 */
	public static void main(String[] args) {

		// We invoke the person class and print out the output of the input
		Person person = new Person("Eric Agyapong", 1987);
		System.out.println("look for the person with the bio-information: " + person.toString());

		// We invoke the student class and print out the output of the input
		Student student = new Student("Goel Armah", 1980, "Statistics");
		System.out.println("\nThis student's detailed information are: " + student.toString());

		// We invoke the Instructor class and print out the output of the input
		Instructor instructor = new Instructor("Noah Ampomah", 1997, 15000);
		System.out.println("\nThe instructor's details on file are: " + instructor.toString());

		// We invoke the student class and print out the output of the input
		Person personToStudent = new Student("Goel Armah", 1980, "Statistics");
		System.out.println("\nThis student's detailed information are: " + personToStudent.toString());

		// We invoke the Instructor class and print out the output of the input
		Person personToInstructor = new Instructor("Noah Ampomah", 1997, 15000);
		System.out.println("\nThe instructor's details on file are: " + personToInstructor.toString());

	}

}
