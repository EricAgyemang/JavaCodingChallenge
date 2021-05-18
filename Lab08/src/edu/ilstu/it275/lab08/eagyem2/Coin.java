/**
 * 
 */
package edu.ilstu.it275.lab08.eagyem2;

/**
 * @author eagyem2
 * 
 * This is the coin class that is responsible for knowing the coins and
 * their values
 *
 */
public class Coin {

	// Declaring the attributes of this class
	private double amount;
	private String name;

	// Declaring and initializing the constants given in the text
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;
	public static final double DOLLAR_VALUE = 1;

	// Declaring constructors for the class and using the if else conditions to come
	// up with the total amount in a transaction
	public Coin(double aValue, String aName) {
		name = aName;
		amount = aValue;
		if (name.equals("quarter")) {
			amount = aValue * QUARTER_VALUE;
		} else if (name.equals("dime")) {
			amount = aValue * DIME_VALUE;
		} else if (name.equals("nickel")) {
			amount = aValue * NICKEL_VALUE;
		} else if (name.equals("penny")) {
			amount = aValue * PENNY_VALUE;
		} else if (name.equals("dollar")) {
			amount = aValue * DOLLAR_VALUE;
		} else {
			amount = 0;
		}
	}

	// Declaring getters for the for the attributes
	// We user the switch statements in the getaValue() method to
	// return the type of coin value present in the payment
	public double getValue() {

		return amount;
	}

}
