/**
 * 
 */
package edu.ilstu.it275.pgm08.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of Resistor containing the detailed information about
 * colored bands on a resistor indicating the resistor's resistance in
 * ohms and tolerance
 *
 */
public class Resistor {

	// Declaring the attributes of the resistor
	private double nominalValueOfResistance;
	private double actualValueOfResistance;
	private double tolerance;
	private String resistorDescription;
	private int significantDigit;
	private double decimalMultiplier;

	// Declaring the constructor for the
	public Resistor(double nominalValueOfResistance, double tolerance) {
		this.nominalValueOfResistance = nominalValueOfResistance;
		this.tolerance = tolerance;
	}

	// Declaring getter for the nominal value of the resistance
	public double getNominalValueOfResistance() {
		return nominalValueOfResistance;
	}

	// Declaring getter for the actual value of the resistance
	public double getActualValueOfResistance() {
		// Initializing the minimum and maximum bounds of the actual resistance
		double minActualValueOfResistance = 0;
		double maxActualValueOfResistance = 0;

		// finding the minimum and maximum bounds of the actual resistance
		minActualValueOfResistance = nominalValueOfResistance - ((nominalValueOfResistance * tolerance) * 0.01);
		maxActualValueOfResistance = nominalValueOfResistance + ((nominalValueOfResistance * tolerance) * 0.01);

		// We generate random numbers to apply to the final actual value of the
		// resistance
		actualValueOfResistance = minActualValueOfResistance
				+ (Math.random() * (maxActualValueOfResistance - minActualValueOfResistance));
		return actualValueOfResistance;
	}

	// We add a get resistor description method that returns a string containing the
	// color bands describing the resistor.
	public String getResistorDescription(String firstBandColor, String secondBandColor, String thirdBandColor,
			String forthBandColor) {
		// Initializing the variables to zero
		resistorDescription = "";
		nominalValueOfResistance = 0;
		tolerance = 0;
		int firstSignificantDigit = 0;
		int secondSignificantDigit = 0;

		// Establishing the first and second significant digits set to the first and
		// second color bands respectively
		firstSignificantDigit = getSignificantDigit(firstBandColor);
		secondSignificantDigit = getSignificantDigit(secondBandColor);

		// use if else conditions to get the appropriate description of the resistors
		if (firstSignificantDigit != -1) {
			resistorDescription += firstSignificantDigit;
		}
		if (secondSignificantDigit != -1) {
			resistorDescription += secondSignificantDigit;
		}

		significantDigit = Integer.parseInt(resistorDescription);
		decimalMultiplier = getDecimalMultiplier(thirdBandColor);
		if (decimalMultiplier != 1) {
			nominalValueOfResistance = significantDigit * decimalMultiplier;
		} else {
			nominalValueOfResistance = significantDigit;
		}

		tolerance = getTolerance(forthBandColor);
		if (tolerance != -1) {
			resistorDescription = String.format("for a norminal resistance of %,.0fk ohms +-%.0f percent",
					(nominalValueOfResistance / 1000), tolerance);
		} else {
			resistorDescription = String.format("for a norminal resistance of %,.0fk ohms",
					(nominalValueOfResistance / 1000));
		}

		return resistorDescription;
	}

	// Helper method to grasp each significant digits for the color bands
	// We will use the switch case method applied to the get significant digit
	// method.
	public int getSignificantDigit(String bandColor) {
		switch (bandColor.toLowerCase()) {
		case "black":
			significantDigit = 0;
			break;
		case "brown":
			significantDigit = 1;
			break;
		case "red":
			significantDigit = 2;
			break;
		case "orange":
			significantDigit = 3;
			break;
		case "yellow":
			significantDigit = 4;
			break;
		case "green":
			significantDigit = 5;
			break;
		case "blue":
			significantDigit = 6;
			break;
		case "violet":
			significantDigit = 7;
			break;
		case "gray":
			significantDigit = 8;
			break;
		case "white":
			significantDigit = 9;
			break;
		default:
			significantDigit = 0;
		}
		return significantDigit;
	}

	// Helper method to grasp the decimal multiplier values for the color bands
	// We will use the switch case method applied to the get decimal multiplier
	// method.
	public double getDecimalMultiplier(String bandColor) {
		switch (bandColor.toLowerCase()) {
		case "black":
			decimalMultiplier = 1;
			break;
		case "brown":
			decimalMultiplier = 10;
			break;
		case "red":
			decimalMultiplier = 100;
			break;
		case "orange":
			decimalMultiplier = 1000;
			break;
		case "yellow":
			decimalMultiplier = Math.pow(10, 4);
			break;
		case "green":
			decimalMultiplier = Math.pow(10, 5);
			break;
		case "blue":
			decimalMultiplier = Math.pow(10, 6);
			break;
		case "violet":
			decimalMultiplier = Math.pow(10, 7);
			break;
		case "gray":
			decimalMultiplier = Math.pow(10, 8);
			break;
		case "white":
			decimalMultiplier = Math.pow(10, 9);
			break;
		case "gold":
			decimalMultiplier = Math.pow(10, -1);
			break;
		case "silver":
			decimalMultiplier = Math.pow(10, -2);
			break;
		default:
			decimalMultiplier = 0;

		}
		return decimalMultiplier;
	}

	// Helper method to grasp the tolerance values for the color bands
	// We will use the switch case method applied to the get tolerance method.
	public double getTolerance(String bandColor) {
		switch (bandColor.toLowerCase()) {
		case "brown":
			tolerance = 1;
			break;
		case "red":
			tolerance = 2;
			break;
		case "green":
			tolerance = 0.5;
			break;
		case "blue":
			tolerance = 0.25;
			break;
		case "violet":
			tolerance = 0.1;
			break;
		case "gray":
			tolerance = 0.05;
			break;
		case "gold":
			tolerance = 5;
			break;
		case "silver":
			tolerance = 10;
			break;
		case "none":
			tolerance = 20;
			break;
		}
		return tolerance;
	}
}
