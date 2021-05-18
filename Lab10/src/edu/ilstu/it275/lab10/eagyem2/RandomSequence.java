/**
 * 
 */
package edu.ilstu.it275.lab10.eagyem2;

/**
 * @author eagyem2
 *
 * This is the class of Random sequence that implements the Sequence
 * interface
 */
public class RandomSequence implements Sequence {

	// We implement the next() method
	public int next() {
		return (int) (Integer.MAX_VALUE * Math.random());
	}
}