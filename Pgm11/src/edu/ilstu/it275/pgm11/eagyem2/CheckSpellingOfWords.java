/**
 * 
 */
package edu.ilstu.it275.pgm11.eagyem2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author eagyem2
 * 
 *   This is a class of CheckSpellingOfWords that checks the spelling of
 *   all words in a file and print out all words that it cannot find in
 *   the word list
 *
 */
public class CheckSpellingOfWords {

	// The main method is declared as main which throws and IOException
	public static void main(String[] args) throws IOException {

		// We declare array lists for the word list
		ArrayList<String> wordsList = new ArrayList<>();

		// We declare array lists for the words to be used to check the word list
		ArrayList<String> workOnFile = new ArrayList<>();

		//Print out a statement to the user to display the list of words not found
		System.out.println("All the words that cannot be found in the word list are: ");

		// Reading in the input files input.txt to be used for trying the program
		readFile(wordsList, "input.txt");
		
		// Reading in the input files words.txt to be used for trying the program
		readFile(workOnFile, "words.txt");

		// We use a for loop to check the conditions for not finding a word from the
		// word list
		for (String wordsOnFile : wordsList) {
			boolean wordFound = false;

			// We use a for loop to check the conditions for finding a word from the word list
			for (String words : workOnFile) {
				if (wordsOnFile.equals(words)) {
					wordFound = true;
					break;
				}
			}

			if (!wordFound) {
				System.out.println(wordsOnFile);
			}
		}
	}

	// Declaring a readFile method for use to read in the file
	public static void readFile(ArrayList<String> words, String fileInput) throws IOException {
		File file = new File(fileInput);

		// Using the scanner class to read in the file
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String word = input.next().toLowerCase();
			words.add(word);

		}
		input.close();
	}

}
