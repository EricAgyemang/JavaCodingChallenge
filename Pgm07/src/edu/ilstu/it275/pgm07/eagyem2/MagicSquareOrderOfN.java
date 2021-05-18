/**
 * 
 */
package edu.ilstu.it275.pgm07.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2
 * 
 * This is a class of the magic square that accepts an input from the
 * user, where n must be odd, then compute a magic square for the user
 *
 */
public class MagicSquareOrderOfN {

	public static void main(String[] args) {
		int row = 0;
		int column = 0;

		// Declaring the scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive odd integer n for the size: ");

		int inputSize = Integer.parseInt(input.nextLine());

		while (inputSize < 1 || inputSize % 2 == 0) {
			System.out.println("Please enter a positive odd integer n: ");
			inputSize = Integer.parseInt(input.nextLine());
			input.close();
		}
		// Setting up the arrays paltform
		int[][] myArray = new int[inputSize][inputSize];

		row = inputSize - 1;
		column = inputSize / 2;

		for (int k = 1; k <= inputSize * inputSize; k++) {
			myArray[row][column] = k;

			// Setting the variables to their respective variable per condition in the
			// question
			int previousRowValues = row;
			int previousColumnValues = column;

			row++;
			column++;

			if (row == inputSize) {
				row = 0;
			}

			if (column == inputSize) {
				column = 0;
			}

			if (myArray[row][column] != 0) {
				row = previousRowValues;
				column = previousColumnValues;
				row--;
			}
		}
        //Printing out the output 
		System.out.println("\nMagic square of size " + inputSize + " x " + inputSize + ":");

		for (int i = 0; i < inputSize; i++) {
			for (int j = 0; j < inputSize; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
