/**
 * 
 */
package edu.ilstu.it275.lab07.eagyem2;

/**
 * @author AGYEMANG ERIC
 * 
 *         This is a class of sequence tester for testing whether two sequences
 *         have the same values in the same order.
 *
 */
public class TestTheSequenceForPatten {

	/**
	 * @param args
	 * 
	 *             The main method is declared as main
	 */
	public static void main(String[] args) {
		// We invoke the Sequence class
		// we create two sequence of objects with size 7 to test the order
		Sequence numSequence = new Sequence(10);

		Sequence orderSquence = new Sequence(10);

		System.out.println("Test 1");
		// We set the values to test the sequence
		numSequence.set(0, 1);
		numSequence.set(1, 2);
		numSequence.set(2, 3);
		numSequence.set(3, 4);
		numSequence.set(4, 5);
		numSequence.set(5, 6);
		numSequence.set(6, 7);
		numSequence.set(7, 8);
		numSequence.set(8, 9);
		numSequence.set(9, 10);

		// We now set the values for the test
		orderSquence.set(0, 1);
		orderSquence.set(1, 2);
		orderSquence.set(2, 3);
		orderSquence.set(3, 4);
		orderSquence.set(4, 5);
		orderSquence.set(5, 6);
		orderSquence.set(6, 7);
		orderSquence.set(7, 8);
		orderSquence.set(8, 9);
		orderSquence.set(9, 10);

		// We then print out the sequence and check for pattern
		System.out.printf("%-10s%-10s\n", " Sequence", " other");
		for (int m = 0; m < numSequence.size(); m++) {
			System.out.printf("%-10d%-10d\n", numSequence.get(m), orderSquence.get(m));
		}

		// Next is to call the equal
		if (numSequence.equals(orderSquence)) {
			System.out.println("The two sequence have the same values in same order");
		} else {
			System.out.println("The two sequence neighter have the same values nor same order");
		}

		System.out.println("\nTest 2");
		// We set the values to test the sequence
		numSequence.set(0, 1);
		numSequence.set(1, 2);
		numSequence.set(2, 3);
		numSequence.set(3, 4);
		numSequence.set(4, 5);
		numSequence.set(5, 6);
		numSequence.set(6, 7);
		numSequence.set(7, 8);
		numSequence.set(8, 9);
		numSequence.set(9, 10);

		// We now set the values by changing some entries to test for pattern
		orderSquence.set(0, 1);
		orderSquence.set(1, 2);
		orderSquence.set(2, 3);
		orderSquence.set(3, 4);
		orderSquence.set(4, 4);
		orderSquence.set(5, 6);
		orderSquence.set(6, 7);
		orderSquence.set(7, 8);
		orderSquence.set(8, 9);
		orderSquence.set(9, 10);

		// We then print out the sequence and check for pattern
		System.out.printf("%-10s%-10s\n", " Sequence", " other");
		for (int m = 0; m < numSequence.size(); m++) {
			System.out.printf("%-10d%-10d\n", numSequence.get(m), orderSquence.get(m));
		}

		// Next is to call the equal
		if (numSequence.equals(orderSquence)) {
			System.out.println("The two sequence have the same values in same order");
		} else {
			System.out.println("The two sequence neighter have the same values nor same order");
		}

		System.out.println("\nTest 3");
		// We set the values to test the sequence by changing some entries to check for
		// pattern

		numSequence.set(0, 1);
		numSequence.set(1, 2);
		numSequence.set(2, 3);
		numSequence.set(3, 4);
		numSequence.set(4, 5);
		numSequence.set(5, 6);
		numSequence.set(6, 7);
		numSequence.set(7, 8);
		numSequence.set(8, 9);
		numSequence.set(9, 10);

		// We now set the values for the tester
		orderSquence.set(0, 1);
		orderSquence.set(1, 2);
		orderSquence.set(2, 2);
		orderSquence.set(3, 4);
		orderSquence.set(4, 5);
		orderSquence.set(5, 6);
		orderSquence.set(6, 7);
		orderSquence.set(7, 7);
		orderSquence.set(8, 9);
		orderSquence.set(9, 10);

		// We then print out the sequence and check for pattern
		System.out.printf("%-10s%-10s\n", " Sequence", " other");
		for (int m = 0; m < numSequence.size(); m++) {
			System.out.printf("%-10d%-10d\n", numSequence.get(m), orderSquence.get(m));
		}

		// Next is to call the equal
		if (numSequence.equals(orderSquence)) {
			System.out.println("The two sequence have the same values in same order");
		} else {
			System.out.println("The two sequence neighter have the same values nor same order");
		}

		System.out.println("\nTest 4");
		// We set the values to test the sequence by changing some entries to check for
		// pattern

		numSequence.set(0, 1);
		numSequence.set(1, 2);
		numSequence.set(2, 3);
		numSequence.set(3, 4);
		numSequence.set(4, 5);
		numSequence.set(5, 6);
		numSequence.set(6, 7);
		numSequence.set(7, 8);
		numSequence.set(8, 9);
		numSequence.set(9, 10);

		// We now set the values
		orderSquence.set(0, 1);
		orderSquence.set(1, 2);
		orderSquence.set(2, 3);
		orderSquence.set(3, 4);
		orderSquence.set(4, 5);
		orderSquence.set(5, 6);
		orderSquence.set(6, 7);
		orderSquence.set(7, 8);
		orderSquence.set(8, 9);
		orderSquence.set(9, 10);

		// We then print out the sequence and check for pattern
		System.out.printf("%-10s%-10s\n", " Sequence", " other");
		for (int m = 0; m < numSequence.size(); m++) {
			System.out.printf("%-10d%-10d\n", numSequence.get(m), orderSquence.get(m));
		}

		// We now call the equal function for the final output
		if (numSequence.equals(orderSquence)) {
			System.out.println("The two sequence have the same values in same order");
		} else {
			System.out.println("The two sequence neighter have the same values nor same order");
		}

	}

}
