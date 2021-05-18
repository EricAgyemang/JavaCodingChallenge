/**
 * 
 */
package edu.ilstu.it275.lab06.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 This is a class of loops with numbers that allow us to print
 *         out some numbers
 *
 */
public class LoopsWithNumbersExample {

	/**
	 * @param args the main class is declared as main
	 */
	public static void main(String[] args) {
		// a) We want to print the sum off all even numbers between 2 and 100 inclusive

		// variable for the even numbers is declared and initialized
		int jEven = 2;
		// variable for the sum is declared an initialized
		int jsum = 0;
		// loop statement until condition is false
		while (jEven <= 100) {
			jsum += jEven;
			jEven += 2;
		}
		System.out.println("a. Sum of all even numbers between 2 and 100 (inclusive) is: " + jsum + "\n\n");

		// b) The code below compute the sum of all squares between 1 and 100
		// (inclusive).
		// variable declared for the number which is to be squared and initialized
		int j2num = 1;
		// variable for the squared numbers declared and initialized
		int j2sqr = 1;

		// declaring and initializing the variable for the sum of the squared number
		int j2sum = 0;

		// loop statement until condition is false
		while (j2num <= 100) {
			j2sum += j2sqr;
			j2num += 1;
			j2sqr = j2num * j2num;

		}
		System.out.println("b. The sum of all squares between 1 and 100 (inclusive) is: " + j2sum + "\n\n");

		// c) All powers of 2 from 2 to the 0th power up to 2 to the 20th power
		System.out.println("c. All powers of 2 from 2 to the 0th power up to 2 to the 20th power are: " + "\n");
		// Writing the loop from 0 to 20
		for (int i = 0; i <= 20; i++) {
			System.out.println(Math.pow(2, i));
		}

		// d) The sum of all odd numbers between a and b (inclusive), where a and b are
		// inputs.
		// declaring and initializing the variables
		int jStart = 0;

		int jEnd = 0;

		// Allowing user to input the value of a
		System.out.println("\n\n" + "d) Please enter a value for a: ");
		Scanner input = new Scanner(System.in);
		jStart = Integer.parseInt(input.nextLine());

		// Allowing user to input the value of b
		System.out.println("Please enter a value for b: ");
		jEnd = Integer.parseInt(input.nextLine());

		// For the loop
		int jStart_1 = 0;

		int sumOfOdd = 0;

		// Checking if value entered by the user is an odd number or even
		if (jStart % 2 == 0) {
			// then is even so increase by 1 and assigned to jstart_1
			jStart_1 = jStart + 1;
		} else {
			// if odd number is assigned to the jstart_1
			jStart_1 = jStart;
		}

		// the loop condition until the value exceed b entered
		while (jStart_1 <= jEnd) {
			// The odd numbers are added to the sum
			sumOfOdd += jStart_1;

			// the numbers are then increased by 2
			jStart_1 += 2;

		}
		System.out.println(
				"Sum of all odd numbers between " + jStart + " and " + jEnd + " (inclusive) " + " is: " + sumOfOdd);

		input.close();
	}

}
