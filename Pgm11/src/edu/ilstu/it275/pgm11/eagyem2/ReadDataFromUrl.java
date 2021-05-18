/**
 * 
 */
package edu.ilstu.it275.pgm11.eagyem2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author eagyem2
 * 
 * This is a class of ReadDataFromULR that reads all the data from a
 * specific URL and writes it to a file
 *
 */

public class ReadDataFromUrl {

	// The main method is declared as main
	public static void main(String[] args) {

		// print out a statement to the user to input the URL
		System.out.println("Please enter URL: ");

		// We use the scanner class to read the input URL
		Scanner input = new Scanner(System.in);
		String uRL = input.nextLine();

		// We print out a statement to the user to enter the file to be written to
		System.out.println("Please enter the file to be written to");
		// We read in the input file
		String fileName = input.nextLine();

		// Declaring and using an array list
		ArrayList<String> list = new ArrayList<String>();

		// use the try to deal wit exceptions that may be thrown
		try {
			FileOutputStream fileOutput = new FileOutputStream(fileName);
			PrintWriter printWrite = new PrintWriter(fileOutput);

			// Declaring variable for the URL
			String urlAddr = uRL;
			URL pageLoc = new URL(urlAddr);

			// Read in the input url using the scanner class
			Scanner in = new Scanner(pageLoc.openStream());

			// Use the while loop to check the condition for the required entry of words
			// from the list
			while (in.hasNextLine()) {
				String readData = in.nextLine();
				list.add(readData);

				// Print out the result after condition is satisfied
				System.out.println(readData);
				printWrite.println(readData);
			}

			// Use the for loop to get the list required
			for (int j = 0; j < list.size(); j++) {
				printWrite.println(list.get(j));
			}
			// Closing the printWrite file
			printWrite.close();
		}

		// We use the catch clause to deal with the possible exceptions
		catch (IOException e) {
			e.printStackTrace();
		}

		// Close the scanner class
		input.close();
	}
}
