/**
 * 
 */
package edu.ilstu.it275.lab07.eagyem2;

/**
 * @author AGYEMANG ERIC
 * 
 * This is a class of Array methods that allows 
 * us to carry out the some tasks for an array of integers
 *
 */
public class ArrayMethods {

	//Declaring the attribute value in the class
	private int[] values;

	//Declaring a constructor for the class
	public ArrayMethods(int[] initValues) {
		values = initValues;

	}

	// Swap first and last elements in the array
	public void swapFirstAndLast() {
		int firstValue = values[0];
		int lastValue = values[values.length - 1];
		values[0] = lastValue;
		values[values.length - 1] = firstValue;

	}

	// Shift all elements to the right by one and move the last element into the
	// first position
	public void shiftRight() {
		int lastValue = values[values.length - 1];
		for (int m = values.length - 2; m >= 0; m--) {
			values[m + 1] = values[m];
		}
		values[0] = lastValue;
	}

	
	// Replace all even numbers with 0
	public void replaceEvenByZeros() {
		for (int m = 0; m < values.length; m++) {
			if (values[m] % 2 == 0) {
				values[m] = 0;
			} else {
				values[m] = values[m];
			}
		}

	}

	// Remove the middle element if the array length is odd, or the middle two
	// elements if the length is even
	public void removeMiddleElements() {
		int middleElement = 0;
		int arrayLenght = values.length;

		// We check if the length is even
		if (arrayLenght % 2 == 0) {
			middleElement = arrayLenght / 2;
			values[middleElement] = 0;
			values[middleElement + 1] = 0;
		} else {
			middleElement = arrayLenght / 2;
			values[middleElement] = 0;
		}

	}

	// Move all even elements to the front, otherwise preserving the order of the
	// elements
	public void moveEvenElementsToFront() {
		int evenElementPosition = 0;
		for (int m = 0; m < values.length; m++) {
			// We check if an element in the array is even
			if (values[m] % 2 == 0) {
				int temporalStorage = values[m];
				// We move the element to the front
				for (int n = m; n > evenElementPosition; n--) {
					values[n] = values[n - 1];
				}
				// We then move the temporalStorage element to the front
				values[evenElementPosition] = temporalStorage;
				evenElementPosition++;
			} else {
				values[m] = values[m];
			}
		}
	}

	// Return the second largest element in the array
	public int secondLargestElement() {

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int m = 0; m < values.length; m++) {
			firstLargest = Math.max(firstLargest, values[m]);
		}

		for (int m = 0; m < values.length; m++) {
			if (values[m] != firstLargest) {
				secondLargest = Math.max(secondLargest, values[m]);
			}
		}
		// return second largest
		return secondLargest;
	}

	// Return true if the array is currently sorted in ascending order
	public boolean sortedInAscendingOrder() {
		boolean elementInIncreasingOrder = true;
		for (int m = 0; m < values.length - 1; m++) {
			if (values[m] > values[m + 1]) {
				elementInIncreasingOrder = false;
			}
		}
		return elementInIncreasingOrder;
	}

	// Return true if the array contains two adjacent duplicate elements

	public boolean containsTwoAdjacentDuplicateElements() {
		boolean AdjacentDuplicateElements = false;
		for (int m = 0; m < values.length - 1; m++) {
			if (values[m] == values[m + 1]) {
				AdjacentDuplicateElements = true;
			}
		}
		return AdjacentDuplicateElements;
	}

	// Return true if the array contains duplicate elements (which need not be
	// adjacent)

	public boolean containsDuplicateElements() {
		boolean duplicateElements = false;
		for (int m = 0; m < values.length; m++) {
			for (int j = 0; j < values.length; j++) {
				if (m == j) {
					continue;
				} else if (values[m] == values[j]) {
					duplicateElements = true;
				}
			}
		}
		return duplicateElements;
	}

	// We declare a helper method to help us print the outputs
	public void print() {
		System.out.println("the results is: ");
		for (int m = 0; m < values.length; m++) {
			System.out.print(values[m] + ", ");
		}
		System.out.println();

	}

}
