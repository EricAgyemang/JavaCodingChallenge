/**
 * 
 */
package edu.ilstu.it275.pgm08.eagyem2;

/**
 * @author eagyem2
 *
 * This is a class of ResistorTester that demonstrates that the resistor
 * class works properly by displaying actual resistance for the resistor
 * based on chosen values
 */
public class ResistorTester {

	/**
	 * @param args
	 * 
	 * This is the main method declared for the resistor tester class
	 */
	public static void main(String[] args) {

		// We display the information of the resistor to the user
		System.out.println("The display of actual resistance for ten 330 ohm +- 10 percent resistors are: ");

		// We invoke the resister class and declare an array of size 10 for the
		// simulation
		Resistor resistors[] = new Resistor[10];

		// We use a loop to displaying actual resistance for ten ten 330 +- 10 percent
		// resistors
		for (int i = 0; i < resistors.length; i++) {
			resistors[i] = new Resistor(330, 10);
			// We print out the results of the simulation of the 10 resistors
			System.out.printf("\n Actual resistance for Resistor %d is %.4f ohm", (i + 1),
					resistors[i].getActualValueOfResistance());
		}

		// We test the method that returns a string containing the color bands
		// describing the resistor
		// We invoke the resistor method and put in the minimal value of the resistance
		// and the value of the tolerance
		Resistor resistor = new Resistor(330, 10);
		// We put in four selected colors of the resistor
		String description = resistor.getResistorDescription("red", "violet", "green", "gold");

		// We print out the results of the simulation
		System.out.println("\n\nDisplaying the results of the selected colors of the color bands describing the resistor. "
						+ "\nThese color bands combination (left to right) describes a resistor " + description);
	}

}
