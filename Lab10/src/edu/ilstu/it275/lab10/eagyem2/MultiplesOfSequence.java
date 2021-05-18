package edu.ilstu.it275.lab10.eagyem2;

//This is a class of Multiples of sequence that implements the Sequence interface
public class MultiplesOfSequence implements Sequence {

	// We declare the attributes here
	private int number;
	private int multiplier;

	// We declare the constructor here
	public MultiplesOfSequence(int n) {
		number = n;
		multiplier = 0;
	}

	// We implement the next method
	public int next() {
		multiplier++;

		return number * multiplier;
	}

}
