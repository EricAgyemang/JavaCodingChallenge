/**
 * 
 */
package edu.ilstu.it275.lab10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of Power of Sequence that implements the Sequence
 * interface
 *
 */
public class PowersOfSequence implements Sequence {

	// We declare the attributes here
	private int number;
	private int exponent;

	// We declare a constructor
	public PowersOfSequence(int numP) {
		number = 0;
		exponent = numP;
	}

	// We implement the next method
	public int next() {
		number++;
		return (int) Math.pow(number, exponent);

	}

}
