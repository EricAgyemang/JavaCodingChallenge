/**
 * 
 */
package edu.ilstu.it275.pgm10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of Prime Sequence Tester that prints out the prime
 * sequence required in this problem.
 *
 */
public class PrimeSequenceTester {

	/**
	 * @param args
	 * the main method is declared here as main
	 */
	public static void main(String[] args) {
		// We invoke the SequenceOfPrimeGenerar class here and use it to invoke our
		// parameters of that class
		SequenceOfPrimeGenerator generator = new SequenceOfPrimeGenerator();

		// We invoke the PrimeSequence class here and use it to invoke our parameters of
		// that class
		PrimeSequence primeSequence = new PrimeSequence();

		// We put in the condition of the print out to print the first 20 sequence of 40
		// prime numbers
		generator.primeNumersGenerator(20, new PrimeSequence());
		generator.displayOutPut();
		System.out.println();

		// We put in the condition of the print out to print the first 40 sequence of 40
		// prime numbers
		SequenceOfPrimeGenerator generator2 = new SequenceOfPrimeGenerator(40);
		generator2.primeNumersGenerator(primeSequence);
		generator2.displayOutPut();

	}

}
