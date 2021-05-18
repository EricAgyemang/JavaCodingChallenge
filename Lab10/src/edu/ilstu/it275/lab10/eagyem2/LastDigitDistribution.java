/**
 * 
 */
package edu.ilstu.it275.lab10.eagyem2;

import java.util.Arrays;

/**
 * @author eagyem2
 * 
 * This is the class of last digit distribution that implements the The
 * given methods to obtain the required set of output
 *
 */
public class LastDigitDistribution {

	// We declare the attribute counters as given in the problem
	private int[] counters;

	// We declare a constructor without parameters
	public LastDigitDistribution() {
		clearCounters();
	}

	// The main method is declared as main
	public static void main(String[] args) {

		// Invoking last distribution method to be used for calling that class
		LastDigitDistribution me = new LastDigitDistribution();

		// We invoke the Sequence interface here
		Sequence seq = new RandomSequence();
		me.process(seq, 100);

		// print out the output for the sequence
		System.out.println("The array sequence is given by: " + Arrays.toString(me.counters));

		// Declaring the array of sequence of 10 values
		int[] values = seq.values(10);
		System.out.println("The array sequence has values = " + Arrays.toString(values));

		// We clear the counter and call the multiplesOf() method on 2 to get multiple
		// of 2
		me.clearCounters();
		seq = Sequence.multiplesOf(2);
		me.process(seq, 20);
		System.out.println("\nThe array sequence is given by " + Arrays.toString(me.counters));
		values = seq.values(10);
		System.out.println("The array sequence has values = " + Arrays.toString(values));

		// We clear the counter and call the powerOf() method on 2 to get the powers of
		// 2
		me.clearCounters();
		seq = Sequence.powersOf(2);
		me.process(seq, 20);
		System.out.println(Arrays.toString(me.counters));

	}

	// We declare a method clearCounter to be called when we want to clare the
	// counter
	public void clearCounters() {
		counters = new int[10];
	}

	// We implement the process method of the last digit distribution class given in
	// the question
	public void process(Sequence seq, int valuesToProcess) {

		for (int i = 1; i <= valuesToProcess; i++) {
			int value = seq.next();
			int lastDigit = value % 10;
			counters[lastDigit]++;
		}

	}

}
