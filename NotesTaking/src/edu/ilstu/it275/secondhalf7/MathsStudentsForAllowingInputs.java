/**
 * 
 */
package edu.ilstu.it275.secondhalf7;

import java.util.Scanner;

/**
 * @author eagyem2
 *
 */
public class MathsStudentsForAllowingInputs {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please ender the side a");
	 double sideA = Double.parseDouble(input.nextLine());
	 
	 System.out.println("Enter the right side b ");
	 double sideB = Double.parseDouble(input.nextLine());
	 
	 
	 System.out.println("Enter the height ");
	 double height = Double.parseDouble(input.nextLine());
	
	 PythagoreanTheorem calc2 = new PythagoreanTheorem(sideA, sideB);
	 
	 // if we want to put in the calc2 above the sides directly, then we dont need the below
	 //calc2.setSideA(sideA);
	// calc2.setSideB(sideB);
	 calc2.setHeight(height);
	 
	 System.out.println("side c is "+ calc2.getHypothenuse());
	 
	 System.out.println("the area is "+ calc2.getArea());
	input.close();
	}

}
