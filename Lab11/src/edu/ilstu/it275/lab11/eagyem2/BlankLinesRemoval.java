/**
 * 
 */
package edu.ilstu.it275.lab11.eagyem2;

// We import the libraries

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author eagyem2 
 * 
 * This is a class of Blank Lines Removal that reads a file,
 * removes any blank lines, and writes the non-blank lines back to the
 * same file
 */
public class BlankLinesRemoval {

	/**
	 * @param args
	 * 
	 * The main method is declared here as main
	 */

	public static void main(String[] args) {

		// we declare the sets of input Array list of strings
		ArrayList<String> linesOfInputs = new ArrayList<String>();

		// We use the try here to deal with the exception cases that might be
		// encountered
		try (Scanner fileInputs = new Scanner(new File("input.txt"));) {

			// We read all the lines from the input file
			while (fileInputs.hasNext()) {
				// We add up to the lines objects
				linesOfInputs.add(fileInputs.nextLine());
			}

			// Removing all blank lines from the text
			while (linesOfInputs.size() > 0 && linesOfInputs.contains("")) {
				linesOfInputs.remove(linesOfInputs.indexOf(""));
			}

			// We save the result of the text in the same text after blank lines are removed
			PrintWriter outputOfFile = new PrintWriter(new FileWriter("input.txt"));
			for (int i = 0; i < linesOfInputs.size(); i++) {

				// We write the output of the file
				if (i == linesOfInputs.size() - 1) {
					outputOfFile.write(linesOfInputs.get(i));
				} else {
					outputOfFile.write(linesOfInputs.get(i) + "\n");

					// Displaying the content of the output file on the console
					System.out.println(linesOfInputs.get(i));
				}
			}
			// We flush the output here
			outputOfFile.flush();
			// We close the output stream here
			outputOfFile.close();

		}

		// We use the catch block the catch the FileNotFoundException
		catch (FileNotFoundException except) {

			// We print out the exception message here
			System.out.println("Exception: " + except.getMessage());
		}

		// We use the catch block the catch the FileNotFoundException
		catch (IOException except) {
			// We print out the exception message here
			System.out.println("Exception: " + except.getMessage());
		}
	}
}
