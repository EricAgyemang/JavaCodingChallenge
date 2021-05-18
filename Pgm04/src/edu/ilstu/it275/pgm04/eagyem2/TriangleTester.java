/**
 * 
 */
package edu.ilstu.it275.pgm04.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2 this is a Triangle tester class that allows the user to input
 *         the coordinates of the triangle and we invoke the Triangle class here
 */
public class TriangleTester {

	/**
	 * @param args This is the main method
	 */
	public static void main(String[] args) {
		

		// We declare the scanner class in the main method
		Scanner input = new Scanner(System.in);

		// Allowing the input of the coordinate (x1, y1)
		System.out.println("Please input the cordinates of the Point, (X1,Y1)"+"\n"+ 
		"Caution:make sure you input values with line having contact with each other");

		System.out.println("Please enter the value of X1: ");
		double pointX1 = input.nextDouble();
		System.out.println("Please enter the value of Y1: ");
		double pointY1 = input.nextDouble();

		// Allowing the input of the coordinate (x2, y2)
		System.out.println("Please input the cordinates of the Point, (X2,Y2)");

		System.out.println("Please enter the value of X2: ");
		double pointX2 = input.nextDouble();
		System.out.println("Please enter the value of Y2: ");
		double pointY2 = input.nextDouble();

		// Allowing the input of the coordinate (x3, y3)
		System.out.println("Please input the cordinates of the Point, (X3,Y3)");

		System.out.println("Please enter the value of X3: ");
		double pointX3 = input.nextDouble();
		System.out.println("Please enter the value of Y3: ");
		double pointY3 = input.nextDouble();

		// Invoking the Triangle class here
		Triangle triangle = new Triangle(pointX1, pointY1, pointX2, pointY2, pointX3, pointY3);

		// We call the printLenght method to print out the lengths of the sides of the
		// triangle
		triangle.printLengths();

		// We call the printAngle method to print out the angles of the triangle
		triangle.printAngles();

		// Calling the printPerimeter method to print out the perimeter of the triangle
		triangle.printPerimeter();

		// Calling the printArea method to print out the area of the triangle
		triangle.printArea();
        input.close();
	}

}
