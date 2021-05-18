/**
 * 
 */
package edu.ilstu.it275.lab10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is the class of Coin comparable tester that help to compare all
 * coins
 *
 */
public class CoinComparablesTester {

	/**
	 * @param args
	 * 
	 * The main method is declared as main
	 */
	public static void main(String[] args) {

		Coin coin1 = new Coin(0.05, "Nickel");
		Coin coin2 = new Coin(0.01, "Penny");
		Coin coin3 = new Coin(0.25, "Quarter");
		Coin coin4 = new Coin(0.1, "Dime");

		// We print our the statement showing the details of the coins to be compared
		System.out.println("We make comparison between a " + coin1.getCoinName() + " and  a " + coin2.getCoinName());

		// We use if else conditions to be able to print out the required output
		// We first compare coin1 and coin2
		if (coin1.compareTo(coin2) > 0) {
			System.out.println(coin1.getCoinName() + " is greater than " + coin2.getCoinName());
		} else if (coin1.compareTo(coin2) < 0) {
			System.out.println(coin1.getCoinName() + " is smaller than " + coin2.getCoinName());
		} else {
			System.out.println(coin1.getCoinName() + " is equal to " + coin2.getCoinName());
		}

		// Next we compare coin2 and coin3
		System.out.println("\nWe make comparison between a " + coin2.getCoinName() + " and a " + coin3.getCoinName());
		if (coin2.compareTo(coin3) > 0) {
			System.out.println(coin2.getCoinName() + " is greater than " + coin3.getCoinName());
		} else if (coin2.compareTo(coin3) < 0) {
			System.out.println(coin2.getCoinName() + " is smaller than " + coin3.getCoinName());
		} else {
			System.out.println(coin2.getCoinName() + " is equal to " + coin3.getCoinName());
		}

		// Next we compare coin3 and coin4
		System.out.println("\nWe make comparison between a " + coin3.getCoinName() + " and a " + coin4.getCoinName());
		if (coin3.compareTo(coin4) > 0) {
			System.out.println(coin3.getCoinName() + " is greater than " + coin4.getCoinName());
		} else if (coin3.compareTo(coin4) < 0) {
			System.out.println(coin3.getCoinName() + " is smaller than " + coin4.getCoinName());
		} else {
			System.out.println(coin3.getCoinName() + " is equal to " + coin4.getCoinName());
		}
	}

}
