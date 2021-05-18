/**
 * 
 */
package edu.ilstu.it275.pgm10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of PrimeSequence that implements the Sequence
 * interface
 *
 */
public class PrimeSequence implements Sequence {

	// We declare an attribute n here
	private int n;

	/**
	 * @param n 
	 * 
	 * We declare a constructor without a parameter here, but in this
	 * constructor, we initialize n to 1
	 */
	public PrimeSequence() {
		n = 1;

	}

	// We implement the next method provided in the question
	public int next() {
		n++;

		boolean flag = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			return n;
		} else {
			return 0;
		}
	}

	// We implement the toString method here
	@Override
	public String toString() {
		return "PrimeSequence [n=" + n + "]";
	}
}