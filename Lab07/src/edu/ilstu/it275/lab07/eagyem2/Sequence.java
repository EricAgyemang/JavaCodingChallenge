/**
 * 
 */
package edu.ilstu.it275.lab07.eagyem2;

/**
 * @author AGYEMANG ERIC 
 * 
 * This is a sequence class that accept array inputs and
 * test for same values and same order
 *
 */
public class Sequence {

	private int[] values;

	// Set up a constructor for the class
	public Sequence(int size) {
		values = new int[size];
	}

	// Setter for the values
	public void set(int i, int n) {
		values[i] = n;
	}

	// Getter for the values
	public int get(int i) {
		return values[i];
	}

	// method for the size
	public int size() {
		return values.length;
	}

	// We add the methods to checks whether two sequences have the same values in
	// the same order
	public boolean equals(Sequence other) {
		boolean inTheSameOrder = true;
		for (int i = 0; i < values.length && inTheSameOrder; i++) {
			if (get(i) != other.get(i)) {
				inTheSameOrder = false;
			}
		}
		return inTheSameOrder;
	}

}
