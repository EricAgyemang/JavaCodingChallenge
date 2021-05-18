/**
 * 
 */
package edu.ilstu.it275.lab05.eagyem2;

import java.text.NumberFormat;
import java.util.*;

/**
 * @author eagyem2 This is class of Salary that reads the name and salary if an
 *         employee.
 */
public class Salary {

	/**
	 * @param args the main method is defined as main
	 */
	public static void main(String[] args) {
	

		// Declaring a local variable total salary
		double totalSalary = 0;
		// Creating an instance of an object of s scanner class
		Scanner input = new Scanner(System.in);

		// Allow users to enter their name
		System.out.println("Enter Employee's name: ");
		// Read in the employee's name from the user
		String nameOfEmployee = input.next();

		// Allow user to enter their wages details
		System.out.println("Enter your Per hour wages: ");
		// Read per hour wages from the user
		double hourlyWage = input.nextDouble();

		// Allow users to enter their hours of work
		System.out.println("How many hours worked: ");
		// Read hours worked from the user
		double hoursOfWork = input.nextDouble();

		// Next, we use the if else statement to check the hours worked if is greater
		// than 40 or less
		if (hoursOfWork <= 40) {
			totalSalary = hourlyWage * hoursOfWork;
			System.out.println("This is not an overtime Paycheck");
		} else {
			totalSalary = (hourlyWage * 40) + ((150 / 100.0) * hourlyWage) * (hoursOfWork - 40);
			System.out.println("This is an overtime Paycheck");
		}

		// using the NumberFormat to ensure that salary is properly formatted in dollars
		// and cents.
		NumberFormat form = NumberFormat.getCurrencyInstance();

		// Print out the paycheck for this employee
		System.out.println("The Paycheck for the employee " + nameOfEmployee + " is: " + form.format(totalSalary));
	input.close();
	}

}
