/**
 * 
 */
package edu.ilstu.it275.lab11.eagyem2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author eagyem2
 * 
 * This is the class of ReadFile that carry out the task of writing and
 * reading file
 */
public class ReadingFile {

	/**
	 * @param args
	 * 
	 * The main method is declared as main to execute the program
	 */
	public static void main(String[] args) throws IOException {

		// We declare the object of the BufferedWriter here
		BufferedWriter outRead = null;

		// We use the try here
		try {

			// We write a file with the name hello.txt
			FileWriter pStream = new FileWriter("hello.txt");
			outRead = new BufferedWriter(pStream);

			outRead.write("Hello, World");
			System.out.println("\nWe Store the message to the file");
		}

		// We use the catch clause in case the file fail to open
		catch (IOException e) {
			System.err.println("The error: " + e.getMessage());
		}

		// We close the file
		finally {
			if (outRead != null) {
				outRead.close();
			}

		}

		// We open the same file again
		BufferedReader readTheInput = null;

		// We declare the object of the BufferedReader here
		try {

			// We read in the file with the name hello.txt
			FileReader pStream = new FileReader("hello.txt");
			readTheInput = new BufferedReader(pStream);

			String filetext = readTheInput.readLine();
			System.out.println("\nWe Read the message into a string variable and print it: ");
			System.out.println(filetext);
		}

		// We use the catch clause in case the file fail to open
		catch (IOException f) {
			System.err.println("The error: " + f.getMessage());
		}

		// We close the file
		finally {
			if (readTheInput != null) {
				readTheInput.close();
			}
		}
	}
}
