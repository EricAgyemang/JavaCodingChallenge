/**
 * 
 */
package edu.ilstu.it275.lab10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of coin that implements the comparable interface
 *
 */
public class Coin implements Comparable {

	// We declare the attributes here
	private double coinValue;
	private String coinName;

    //We implement the constructors given by java
	public Coin(double coinValue, String coinName) {
		super();
		this.coinValue = coinValue;
		this.coinName = coinName;
	}

    //We declare the getter for coin value
	public double getCoinValue() {
		return coinValue;
	}

    //We declare a getter for the coin name 
	public String getCoinName() {
		return coinName;
	}

	// we implement the compareTo method from the comaprable interface
	public int compareTo(Coin otherCoin) {

		return Double.compare(coinValue, otherCoin.coinValue);

	}
}
