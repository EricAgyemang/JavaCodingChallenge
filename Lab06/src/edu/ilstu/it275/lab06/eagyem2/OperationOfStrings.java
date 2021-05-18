/**
 * 
 */
package edu.ilstu.it275.lab06.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2
 *
 */
public class OperationOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prompt the user to input in a string
		System.out.println(" a) Enter a String: ");

		// Declaring the scanner class
		Scanner scanner = new Scanner(System.in);

		// Reading in the inputed string
		String input = scanner.nextLine();
		// scanner.close();

		String stringPrint1 = "";
		System.out.println("The uppercase character(s) in the string " + input + " is/are: ");

		// Writing a loop to check the string for Uppercase letters
		for (int i = 0; i < input.length(); i++) {
			char alphabet = input.charAt(i);
			if (Character.isUpperCase(alphabet)) {
				stringPrint1 += alphabet;
			}
		}
		// Display the output
		System.out.println(stringPrint1 + "\n");

		// c) Print out the string, with all vowels (A, E, I, O, U) by an underscore

		System.out.println("c) Print out the string, with all vowels (A, E, I, O, U) by an underscore");
		char[] characterLine1 = input.toCharArray();
		String stringPrint2 = "";

		for (int j = 0; j < characterLine1.length; j++) {
			if (Character.toLowerCase(characterLine1[j]) == 'a' || Character.toLowerCase(characterLine1[j]) == 'e'
					|| Character.toLowerCase(characterLine1[j]) == 'i'
					|| Character.toLowerCase(characterLine1[j]) == 'o'
					|| Character.toLowerCase(characterLine1[j]) == 'u') {

				// We replace all the above vowels in the string with an underscore
				stringPrint2 += "_";
			} else {
				stringPrint2 += characterLine1[j];
			}
		}
		// We print out the output below
		System.out.println(
				"The string " + input + " with all vowels replaced with underscore is: " + stringPrint2 + "\n");

		// d) We write the program to print out the number of vowels (A, E,I,O,U) in the
		// string

		System.out.println("d) Print out the number of vowels (A, E,I,O,U) in the string");
		char[] characterLine2 = input.toCharArray();
		int iCount = 0;

		for (int m = 0; m < characterLine2.length; m++) {
			if (Character.toLowerCase(characterLine2[m]) == 'a' || Character.toLowerCase(characterLine2[m]) == 'e'
					|| Character.toLowerCase(characterLine2[m]) == 'i'
					|| Character.toLowerCase(characterLine2[m]) == 'o'
					|| Character.toLowerCase(characterLine2[m]) == 'u') {
				iCount++;
			}
		}
		// We print out the output the number of vowels
		System.out.println("The total number of vowels for the string " + input + " is: " + iCount + "\n");

		// e) We write the program to print out the position of all vowels (A, E,I,O,U)
		// in the string

		System.out.println("e) Print out the position of all vowels (A, E,I,O,U) in the string");
		char[] characterLine3 = input.toCharArray();

		// Declaring and initializing the variable to store the position of vowel in
		// string
		String stringPosition = " ";

		for (int n = 0; n < characterLine3.length; n++) {
			if (Character.toLowerCase(characterLine3[n]) == 'a' || Character.toLowerCase(characterLine3[n]) == 'e'
					|| Character.toLowerCase(characterLine3[n]) == 'i'
					|| Character.toLowerCase(characterLine3[n]) == 'o'
					|| Character.toLowerCase(characterLine3[n]) == 'u') {

				// Storing the position of vowel characters
				int iPosition = n + 1;

				// Concatenate the position of current vowel with the other vowel character
				stringPosition += iPosition + ", ";
			}
		}
		// We print out the output of the positions of all vowels
		System.out.println("The the positions of all vowels in the string " + input + " are: " + stringPosition);
        scanner.close();
	}
}
