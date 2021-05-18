/**
 * 
 */
package edu.ilstu.it275.lab10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a Sequence interface class containing methods
 */
public interface Sequence {
	public int next();

	// This is the multiplesOf method declared in the sequence interface
	public static Sequence multiplesOf(int n) {
		return new MultiplesOfSequence(n);

	}

	// This is the powerOf method declared in the sequence interface
	public static Sequence powersOf(int numP) {
		return new PowersOfSequence(numP);
	}

	// This is the values method declared in the sequence interface
	public default int[] values(int n) {
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = this.next();
		}
		return numbers;
	}
}
