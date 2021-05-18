/**
 * 
 */
package edu.ilstu.it275.pgm12.eagyem2;

import java.io.File;
import java.util.*;

/**
 * @author eagyem2
 * 
 * This is a class of readtextFromFile that reads a text from a file and
 * breaks it up into individual words.
 *
 */
public class ReadsTextFromFile {

	/**
	 * @param args
	 * 
	 * The main method is declared here as main
	 */
	public static void main(String[] args) {

		// We declare the variable phoneKeypad here
		String phoneKeypad = "";

		// Using the HashMap and declaring the variable wordMap to be used for the
		// computations
		HashMap<String, String> wordMap = new HashMap<>();

		// We use the try block to deal with any possible exception that may be thrown
		try {
			Scanner input = new Scanner(new File("C:\\Users\\eagye\\Desktop\\input.txt"));
			while (input.hasNext()) {
				phoneKeypad = input.nextLine();

				// We declare the result variable to be used for the loop below
				String result = "";

				// we use the for loop here
				for (int j = 0; j < phoneKeypad.length(); j++) {
					char words = Character.toUpperCase(phoneKeypad.charAt(j));
					if (Character.isLetter(words)) {
						int digit = getNumeber(words);
						result += digit;
					} else {
						result += words;
					}

				}

				// We map the results with the phoneKeypad
				wordMap.put(phoneKeypad, result);
			}

			// We declare the Scanner class here
			Scanner scanner = new Scanner(System.in);

			// We print out a statement to direct the user
			System.out.println("Enter a number for the keypad string of input file: ");

			// We use the scanner class to read in the input
			String numInput = scanner.next();
			System.out.println("All of the words in the dictionary that can be spelled with the input numbers are: ");

			// We declare and initialize the variable flag here
			int flag = 0;

			// We use the for loop to check the condition of map of keypad to the user entry
			for (HashMap.Entry<String, String> entry : wordMap.entrySet()) {
				if (numInput.equalsIgnoreCase(entry.getValue())) {
					System.out.println(entry.getKey());
					flag = 1;
				}
			}

			// We use the if else condition to display the output when the condition is met
			// or not met
			if (flag == 0) {
				System.out.println("There is no match found");
			}

			// We close the scanner class
			scanner.close();

			// We use the catch block here for the exception
		} catch (Exception e) {
			System.out.println("Input file missing");
		}
	}

	// We use the switch case approach to map the user input alphabets with the
	// numbers on the keypads
	private static int getNumeber(char capitalLetter) {
		int flag = 0;
		switch (capitalLetter) {
		case 'A':
		case 'B':
		case 'C':
			flag = 2;
			break;
		case 'D':
		case 'E':
		case 'F':
			flag = 3;
			break;
		case 'G':
		case 'H':
		case 'I':
			flag = 4;
			break;
		case 'J':
		case 'K':
		case 'L':
			flag = 5;
			break;
		case 'M':
		case 'N':
		case 'O':
			flag = 6;
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			flag = 7;
			break;
		case 'T':
		case 'U':
		case 'V':
			flag = 8;
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			flag = 9;
			break;
		default:
			flag = 0;
		}
		return flag;
	}
}
