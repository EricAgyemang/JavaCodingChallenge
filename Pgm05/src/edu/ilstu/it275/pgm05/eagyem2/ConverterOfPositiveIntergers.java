/**
 * 
 */
package edu.ilstu.it275.pgm05.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2
 * 
 *         This is a converter of positive integers that accepts an input from
 *         the user and then convert the digits into Roman numerals with a
 *         certain predefine threshold
 *
 */
public class ConverterOfPositiveIntergers {

	/**
	 * @param args The main class is declared as main here
	 */
	public static void main(String[] args) {

		// We allow the user to enter a number
		System.out.println("User, please enter a number less than 3999: ");

		// We create the scanner class here to read the input from the user
		Scanner input = new Scanner(System.in);
		int integerNumber = Integer.parseInt(input.nextLine());

		// We use an if else conditions to aid out conversion
		if (integerNumber < 0 || integerNumber > 3999) {
			System.out.println("Invalid input. Please input a right number");
		} else {
			// We declare a variable integerNum in a string format for use by the switch
			// statement
			String integerNum = "";
			// we find the Unit place digit below and then find the unit digit greater than
			// zero
			int remainderOfNumber = integerNumber % 10;
			if (remainderOfNumber > 0) {
				/**
				 * We will convert the place digit to Roman numeral using the switch statements
				 * for concatenating whole into string
				 */
				switch (remainderOfNumber) {
				case 1:
					integerNum = "I" + integerNum;
					break;
				case 2:
					integerNum = "II" + integerNum;
					break;
				case 3:
					integerNum = "III" + integerNum;
					break;
				case 4:
					integerNum = "IV" + integerNum;
					break;
				case 5:
					integerNum = "V" + integerNum;
					break;
				case 6:
					integerNum = "VI" + integerNum;
					break;
				case 7:
					integerNum = "VII" + integerNum;
					break;
				case 8:
					integerNum = "VIII" + integerNum;
					break;
				case 9:
					integerNum = "IX" + integerNum;
					break;
				default:
					break;
				}
			}

			// Here, we will remove the unit place digit
			integerNumber = integerNumber / 10;
			// Next we find the tenth place digit and find the place digit greater than zero
			remainderOfNumber = integerNumber % 10;
			if (remainderOfNumber > 0) {
				// We will convert the 10th place digit to Roman numerals and concatenate the
				// whole into string
				switch (remainderOfNumber) {
				case 1:
					integerNum = "X" + integerNum;
					break;
				case 2:
					integerNum = "XX" + integerNum;
					break;
				case 3:
					integerNum = "XXX" + integerNum;
					break;
				case 4:
					integerNum = "XL" + integerNum;
					break;
				case 5:
					integerNum = "L" + integerNum;
					break;
				case 6:
					integerNum = "LX" + integerNum;
					break;
				case 7:
					integerNum = "LXX" + integerNum;
					break;
				case 8:
					integerNum = "LXXX" + integerNum;
					break;
				case 9:
					integerNum = "XC" + integerNum;
					break;
				default:
					break;
				}
			}

			// Here, we will remove the 10th place digit
			integerNumber = integerNumber / 10;
			// Next we find the 100th place digit and find the place digit greater than zero
			remainderOfNumber = integerNumber % 10;
			if (remainderOfNumber > 0) {
				// We will convert the 100th place digit to Roman numerals and concatenate the
				// whole into string
				switch (remainderOfNumber) {
				case 1:
					integerNum = "C" + integerNum;
					break;
				case 2:
					integerNum = "CC" + integerNum;
					break;
				case 3:
					integerNum = "CCC" + integerNum;
					break;
				case 4:
					integerNum = "CD" + integerNum;
					break;
				case 5:
					integerNum = "D" + integerNum;
					break;
				case 6:
					integerNum = "DC" + integerNum;
					break;
				case 7:
					integerNum = "DCC" + integerNum;
					break;
				case 8:
					integerNum = "DCCC" + integerNum;
					break;
				case 9:
					integerNum = "CM" + integerNum;
					break;
				default:
					break;
				}
			}
			// Here, we will remove the 100th place digit
			integerNumber = integerNumber / 10;
			// Next we find the 1000th place digit and find the place digit greater than
			// zero
			remainderOfNumber = integerNumber % 10;
			if (remainderOfNumber > 0) {
				// We will convert the 1000th place digit to Roman numerals and concatenate the
				// whole into string
				switch (remainderOfNumber) {
				case 1:
					integerNum = "M" + integerNum;
					break;
				case 2:
					integerNum = "MM" + integerNum;
					break;
				case 3:
					integerNum = "MMMM" + integerNum;
					break;
				default:
					break;
				}
			}

			// Printing out the string variable
			System.out.println("The Roman numerals for the input above is: " + integerNum);
			input.close();
		}
	}
}
