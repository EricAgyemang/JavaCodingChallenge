/**
 * 
 */
package edu.ilstu.it275.lab12.eagyem2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author eagyem2
 * This is a class of read text from file that reads a test from file and breaks it up into individual words
 */
public class ReadTextFromFile {

	/**
	 * @param args
	 * The main method is declared here as main
	 */
	public static void main(String[] args) throws IOException {

		// We create a File object to hold the file path
		File fileObject = new File("test.txt");

		// We insert the words into a tree set to hold only unique words
		TreeSet<String> treeSet = new TreeSet<>();

		// We map object to hold words length as a key with words of the same length
		// separated by comma
		HashMap<Integer, StringBuffer> hashMap = new HashMap<>();

		// We use the scanner class to read in the file
		Scanner input = new Scanner(fileObject);

		// We print out all words on the read in file
		System.out.println("The List of all Words on the read-in file are: ");
		// Using a loop, we iterate over the number of lines in the file
		while (input.hasNextLine()) {
			String lineOfText = input.nextLine();

			// We split the line using a single space
			String myArray[] = lineOfText.trim().split(" ");
			for (String word : myArray) {
				// We will add words to the tree set created
				treeSet.add(word);
				System.out.println(word);

				// We will write the words using an if else statement if a particular key
				// already exist
				if (hashMap.containsKey(word.length())) {
					hashMap.put(word.length(), (StringBuffer) hashMap.get(word.length()).append("," + word));
				}

				// If the word length (Key) does not exist in the hashMap created, we add the
				// key value pair
				if (!hashMap.containsKey(word.length())) {
					hashMap.put(word.length(), new StringBuffer(word));
				}
			}
		}

		// Printing out the unique words for the TreeSet
		System.out.println("\n\nThe list of unique words of the file are: ");
		for (String word : treeSet) {
			System.out.println(word);
		}
		System.out.println("\nThe total number of unique words in the test file is: " + treeSet.size() + "\n");

		System.out.println(
				"The results of the map whose keys are the word length with values comma-separated  strings of words of same length are: ");
		// We then print out the values of the keys pairs from the HashMap
		for (Map.Entry<Integer, StringBuffer> entry : hashMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		input.close();
	}

}
