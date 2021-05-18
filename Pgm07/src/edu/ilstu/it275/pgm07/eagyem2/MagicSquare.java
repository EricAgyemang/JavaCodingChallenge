/**
 * 
 */
package edu.ilstu.it275.pgm07.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of magic square that fives the details of the
 * elements in each row, each column, and diagonals with same values
 *
 */
public class MagicSquare {

	private int[][] element;
	private int sumOfRow;
	private int sumOfColumn;
	private int sumOfDiagonal1;
	private int sumOfDiagonal2;

	/**
	 * @param args
	 * 
	 *             Declaring constructor for the magic square class
	 */

	public MagicSquare(int[][] element) {
		this.element = element;
	}

//Declaring getter for the sum of rows for the that attribute of the class
	public int getSumOfRow(int[][] matrix, int element) {
		int rTotalElements = element * element;
		sumOfRow = 0;
		int rsum = (rTotalElements * (rTotalElements + 1) / (2 * element));
		for (int i = 0; i < element; i++) {
			sumOfRow = 0;
			for (int j = 0; j < element; j++) {
				sumOfRow = sumOfRow + matrix[i][j];
			}

			if (sumOfRow != rsum) {
				rsum = -1;
				break;
			}
		}
		return rsum;
	}

	// Declaring getter for the sum of columns for the that attribute of the class
	public int getSumOfColumn(int[][] matrix, int element) {
		int cTotalElements = element * element;
		sumOfColumn = 0;
		int cSum = (cTotalElements * (cTotalElements + 1) / (2 * element));
		for (int i = 0; i < element; i++) {
			sumOfColumn = 0;
			for (int j = 0; j < element; j++) {
				sumOfColumn = sumOfColumn + matrix[j][i];
			}

			if (sumOfColumn != cSum) {
				cSum = -1;
				break;
			}
		}
		return cSum;
	}

	// Declaring getter for the sum of diagonals for that attributes of the class
	public int getSumOfDiagonals(int[][] matrix, int element) {
		sumOfDiagonal1 = 0;
		sumOfDiagonal2 = 0;
		int dTotalElements = element * element;
		int sumOfTotalElements = (dTotalElements * (dTotalElements + 1) / (2 * element));

		for (int i = 0; i < element; i++) {
			sumOfDiagonal1 = sumOfDiagonal1 + matrix[i][i];
		}

		for (int i = 0; i < element; i++) {
			sumOfDiagonal2 = sumOfDiagonal2 + matrix[element - i - 1][i];
		}

		if (sumOfDiagonal1 == sumOfTotalElements && sumOfDiagonal1 == sumOfDiagonal2) {
			return sumOfTotalElements;
		} else {
			return -1;

		}
	}

	public int[][] getElement() {

		return element;
	}
}
