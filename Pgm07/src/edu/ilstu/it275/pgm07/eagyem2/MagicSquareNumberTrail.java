/**
 * 
 */
package edu.ilstu.it275.pgm07.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2
 * 
 * This is a class of magic Square numbers trail that accepts input
 * numbers from the user and test if those input makes a magic square
 *
 */
public class MagicSquareNumberTrail {

	/**
	 * @param args
	 * 
	 * The main method is declared as main
	 */
	public static void main(String[] args) {

		// Declaring and initializing local variables
		int element = 4;
		int[][] matrix = new int[element][element];
		int[] iNum = new int[(element * element)];

		// Declaring the scanner class
		Scanner input = new Scanner(System.in);

		// Allowing input from the user
		System.out.println("enter " + (element * element) + " elements");
		MagicSquare magicSquare = new MagicSquare(matrix);

		// testing all possible conditions for the matrix
		for (int i = 0; i < element; i++) {
			for (int j = 0; j < element; j++) {
				int elementNum = Integer.parseInt(input.nextLine());
				if (elementNum > (element * element) || elementNum < 1) {

					System.out.println("number should be in range (1," + (element * element) + ")\n");
					return;
				} else {
					if (iNum[elementNum - 1] == 1) {
						System.out.println("repeated number not accetable");
						return;
					} else {
						matrix[i][j] = elementNum;
						iNum[elementNum - 1] = 1;
					}
				}
			}
		}
		// Checking all numbers if they make up a magic square based on the condition
		int notAllElementNum = 0;
		for (int u : iNum) {
			if (u != 1) {
				notAllElementNum = 1;
			}
		}
		if (notAllElementNum == 1) {
			System.out.println(
					"All numbers are not present.\nThe sum of row, each column and the two diagonals is the same value");
		}
		int getSumeOfRows = magicSquare.getSumOfRow(matrix, element);
		int getSumOfColumns = magicSquare.getSumOfColumn(matrix, element);
		int getSumOfDiagonals = magicSquare.getSumOfDiagonals(matrix, element);
		int totalElements = element * element;
		int sum = (totalElements * (totalElements + 1) / (2 * element));
		if (getSumOfDiagonals == getSumOfColumns && getSumOfColumns == getSumeOfRows && getSumOfDiagonals == sum) {
			System.out.println(
					"Matrix is a magic square; the sum of row, each column and the two diagonals is the same value");

		} else {
			System.out.println("This is not a magic square" + "\n"
					+ "Not all numbers are present. Sum of rows, columns, and diagonales are not equal");

		}
		
	}
	
}
