package edu.ilstu.it275.lab10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is the SquareSequence class that implements the Sequence
 * interface
 *
 */
public class SquareSequence implements Sequence {

	// We declare an attribute n here
	private int n;

	// Declaring constructor for this class
	public SquareSequence(int u) {
		n = u;
	}

	// We implement the next method provided in the question
	public int next() {
		n++;
		return n * n;
	}

	/**
	 * @return the n
	 * Declaring getter for the n
	 */
	public int getN() {
		return n;
	}

	// We implement the toString method
	@Override
	public String toString() {
		return "SquareSequence [n=" + n + "]";
	}

}
