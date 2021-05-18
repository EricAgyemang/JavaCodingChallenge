/**
 * 
 */
package edu.ilstu.it275.pgm10.eagyem2;

/**
 * @author eagyem2 
 * This is a class of Sequence of prime Generator that helps to
 * generate the required sequence
 */
public class SequenceOfPrimeGenerator {
//We declare the attributes here
	private int[] myArrayOfPrime;
	private int myArraySize;
	private int primeNum;

	// We declare the constructor with no parameter here.
	public SequenceOfPrimeGenerator() {
		myArraySize = 0;
	}

	// We declare a constructor with the parameter myArraySize
	public SequenceOfPrimeGenerator(int myArraySize) {
		myArrayOfPrime = new int[myArraySize];

		this.myArraySize = myArraySize;
	}

	/**
	 * @return
	 * 
	 * We Declare a getter for the myArraySize attribute
	 */
	public int getMyArraySize() {
		return myArraySize;
	}

	/**
	 * @param
	 * 
	 * We declare a setter for the myArraySize to set the value of that.
	 */
	public void setMyArraySize(int myArraySize) {
		this.myArraySize = myArraySize;
	}

	// We declare a method primeNumersGenerator() with parameters here to help
	// generate the
	// sequence of prime numbers
	public void primeNumersGenerator(int myArraySize, PrimeSequence pS) {
		setMyArraySize(myArraySize);
		primeNumersGenerator(pS);

	}

	// We apply the do while loop to the primeNumersGenerator() to generate the
	// prime sequence of numbers
	public void primeNumersGenerator(PrimeSequence pS) {
		primeNum = 0;
		myArrayOfPrime = new int[myArraySize];
		int i = 0;
		while (i < myArraySize) {
			primeNum = pS.next();
			if (primeNum != 0) {
				myArrayOfPrime[i] = primeNum;
				i++;
			}
		}
	}

	// We declare a display method here to print out the output of the required
	// sequence
	public void displayOutPut() {
		System.out.println("The sequence of " + myArraySize + " prime numbers are: ");
		for (int i = 0; i < myArraySize; i++) {
			System.out.println(myArrayOfPrime[i]);
		}
	}
}
