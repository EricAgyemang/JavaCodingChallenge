/**
 * 
 */
package edu.ilstu.it275.pgm04.eagyem2;

/**
 * @author eagyem2 This is a Triangle class that prompt a user for the corner
 *         point coordinates
 */
public class Triangle {

	// Declaring the attributes of the triangle class which include the coordinates
	// The coordinates of the first side of the triangle
	private double X1, Y1;

	// The coordinates of the second side of the triangle
	private double X2, Y2;

	// The coordinates of the third side of the triangle
	private double X3, Y3;

	// We declare the constructor to set the three
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.X1 = x1;
		this.Y1 = y1;
		this.X2 = x2;
		this.Y2 = y2;
		this.X3 = x3;
		this.Y3 = y3;
	}

	/**
	 * @param args We declare the method getPerimter for computing the perimeter of
	 *             the triangle This is the sum of the length of the three sides.
	 */
	public double getPerimeter() {
		// We call the getLength to compute the length of each sides of the triangle
		double length1 = getLength(X1, Y1, X2, Y2);
		double length2 = getLength(X2, Y2, X3, Y3);
		double length3 = getLength(X1, Y1, X3, Y3);

		return length1 + length2 + length3;
	}

	// We declare the method getArea for computing the area of the triangle with the
	// given coordinates
	public double getArea() {
		double a = getLength(X1, Y1, X2, Y2);
		double b = getLength(X2, Y2, X3, Y3);
		double c = getLength(X1, Y1, X3, Y3);
		double p = getPerimeter() / 2.0;

		// putting in the formula of area of the triangle
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return area;
	}

	// Declaring the method getLength that accept any two coordinates of the
	// triangle to help calculate
	// the length of the two points.
	public double getLength(double X1, double Y1, double X2, double Y2) {
		double distance = 0;

		distance = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
		return distance;
	}

	// We declare a getSlope method to compute the slope when two points are
	// inputed.
	public double getSlope(double X1, double Y1, double X2, double Y2) {
		double slope = 0;

		slope = (Y2 - Y1) / (X2 - X1);

		return slope;

	}

	// We declare the method getAngle that accepts the slopes of the two lines
	public double getAngle(double m1, double m2) {
		double degrees = 0;
		double angle = 0;
		angle = (m2 - m1) / (1 + m1 * m2);
		if (angle < 0)
			angle = -angle;
		angle = Math.atan(angle);

		// converting the radian to degrees
		degrees = angle * (180 / 3.1415);
		return degrees;
	}

	// We declare the printLength method for printing out the lengths of the sides
	// of the triangle
	public void printLengths() {
		System.out.print("---------------------------------------------------\n\n");

		System.out.print("The point P1(" + X1 + "," + Y1 + ")");
		System.out.print("The point P2(" + X2 + "," + Y2 + ")");
		System.out.printf(" Distance : %8.2f\n", getLength(X1, Y1, X2, Y2));
		System.out.print("The point P2(" + X2 + "," + Y2 + ")");
		System.out.print("The point P3(" + X3 + "," + Y3 + ")");
		System.out.printf(" Distance : %8.2f\n", getLength(X2, Y2, X3, Y3));
		System.out.print("The point P1(" + X1 + "," + Y1 + ")");
		System.out.print("The point P3(" + X3 + "," + Y3 + ")");
		System.out.printf(" Distance : %8.2f\n", getLength(X1, Y1, X3, Y3));

		System.out.print("---------------------------------------------------\n\n");

	}

	// We declare the printAngles method to print the angles of the triangle
	public void printAngles() {
		System.out.println("Line (P1-->P2)");
		double m1 = getSlope(X1, Y1, X2, Y2);
		System.out.println("Line (P1-->P3)");
		double m2 = getSlope(X1, Y1, X3, Y3);

		System.out.printf("Angle A:%10.0f\n", getAngle(m1, m2));

		System.out.println("-----------------------------------------------------");

		System.out.println("Line (P2-->P1)");
		m1 = getSlope(X2, Y2, X1, Y1);
		System.out.println("Line (P2-->P3)");
		m2 = getSlope(X2, Y2, X3, Y3);

		System.out.printf("Angle B:%10.0f\n", getAngle(m1, m2));

		System.out.println("-----------------------------------------------------");

		System.out.println("Line (P3-->P1)");
		m1 = getSlope(X3, Y3, X1, Y1);
		System.out.println("Line (P3-->P2)");
		m2 = getSlope(X3, Y3, X2, Y2);

		System.out.printf("Angle C:%10.0f\n", getAngle(m1, m2));

		System.out.println("-----------------------------------------------------\n\n");

	}

	// We declare the getPrimeter method to help print out the perimeter
	public void printPerimeter() {
		System.out.printf("Perimeter of the triangle:%8.2f\n", getPerimeter());
	}

	// The method that will help us print out the area of the triangle is declared
	// as
	public void printArea() {
		System.out.printf("Area of the triangle:%8.2f\n", getArea());
	}

}
