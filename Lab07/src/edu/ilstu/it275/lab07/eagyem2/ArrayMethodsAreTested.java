/**
 * 
 */
package edu.ilstu.it275.lab07.eagyem2;

import java.util.Arrays;

/**
 * @author AGYEMANG ERIC
 *
 */
public class ArrayMethodsAreTested {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaring and initializing the variable value
		int values[] = { 1, 4, 9, 16, 25 };

		// Invoking the ArrayMethods class

		int storeArray[] = Arrays.copyOf(values, values.length);
		ArrayMethods myArray = new ArrayMethods(storeArray);

		// Printing out the inputed array
		System.out.print("The initial array inputted without invoking any methods, ");
		myArray.print();

		// 1. Swapping the first and last element in the array, we invoke the
		// swapFirstAndLast() method
		System.out.println("\n# 1) Invoking the swap first and last element method,  ");
		myArray.swapFirstAndLast();
		myArray.print();

		// 2.Shift all elements to the right by one and move the last element into the
		// first position
		System.out.println("\n#2) Invoking the shift all elements to the right method,  ");
		myArray.shiftRight();
		myArray.print();

		// 3.Replace all even numbers with 0
		System.out.println("\n#3) Invoking the replace all even numbers with 0 method,   ");
		myArray.replaceEvenByZeros();
		myArray.print();

		// 4.Remove the middle element if the array length is odd, or the middle two
		// elements if the length is even
		System.out.println("\n#4) Invoking the remove the middle element method, ");
		myArray.removeMiddleElements();
		myArray.print();

		// 5. Move all even elements to the front, otherwise preserving the order of the
		// elements
		System.out.println("\n#5) Invoking the move all even to the front,  ");
		myArray.moveEvenElementsToFront();
		myArray.print();

		// 6. Return the second largest element in the array
		System.out.println("\n#6) Invoking the return the second largest element method, the result is: " + "\n"
				+ myArray.secondLargestElement());

		// 7. Return true if the array is currently sorted in ascending order
		System.out.println("\n#7) Invoking the sorted in ascending order method, the result is:" + "\n"
				+ myArray.sortedInAscendingOrder());

		// 8. Return true if the array contains two adjacent duplicate elements
		System.out.println("\n#8) Invoking the contains two adjacent duplicate elements method, the result is: " + "\n"
				+ myArray.containsTwoAdjacentDuplicateElements());

		// 9. Return true if the array contains duplicate elements (which need not be
		// adjacent)
		System.out.println("\n#9) Invoking the contains duplicate elements method, the result is: " + "\n"
				+ myArray.containsDuplicateElements());

	}

}
