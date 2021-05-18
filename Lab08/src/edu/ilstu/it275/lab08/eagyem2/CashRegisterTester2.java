/**
 * 
 */
package edu.ilstu.it275.lab08.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a cash register2 class that test the cash register2 class to
 * returns the number of coins of a particular type
 *
 */
public class CashRegisterTester2 {

	/**
	 * @param args
	 * 
	 * The main method is declared as main
	 */
	public static void main(String[] args) {

		// We invoke the cash register2 class here
		CashRegister2 register2 = new CashRegister2();

		// Calling the record purchase method
		register2.recordPurchase(15);
		register2.recordPurchase(8);
		// Invoking the method multiple times, once for each type of coin that is
		// present in the payment
		// Calling to Processes the payment received from the customer based on the coin
		// count and coin type

		// We invoke the dollar from coin class
		Coin dollar = new Coin(1, "dollar");
		register2.receivePayment(30, dollar);
		System.out.println("This is a Dollar: ");
		// We print out the change when one purchase with dollar for the given amount
		System.out.println(
				"the change in this transaction is: " + register2.giveChange(dollar) + " \nExpected is: 7.0" + "\n");

		// We invoke the quarter coin from coin class
		Coin quarter = new Coin(0.25, "quarter");
		register2.receivePayment(25, quarter);
		System.out.println("This is a Quarter:");
		// print out the change for the payment with quarter coin
		System.out.println("The change in this transaction is: " + register2.giveChange(quarter)
				+ " \nExpected is: 1.5625 " + "\n");

		// Invoking the dime coin from coin class
		Coin dime = new Coin(0.1, "dime");
		register2.receivePayment(25, dime);
		System.out.println("This is a Dime: ");
		// print out the change for the payment with dime coin
		System.out.println(
				" The change in this transaction is: " + register2.giveChange(dime) + " \nExpected is: 0.2500" + "\n");

		// Invoking the nickel coin from coin class
		Coin nickel = new Coin(0.05, "nickel");
		register2.receivePayment(25, nickel);
		System.out.println("This is a Nickel: ");
		// print out the change for the payment with nickel coin
		System.out.println(" The change in this transaction is: " + register2.giveChange(nickel)
				+ " \nExpected is: 0.06250" + "\n");

		// Invoking the penny coin from coin class
		Coin penny = new Coin(0.01, "penny");
		register2.receivePayment(25, penny);
		System.out.println("This is a Penny: ");
		// print out the change for the payment with penny coin
		System.out.println(
				" The change in this transaction is: " + register2.giveChange(penny) + " \nExpected is: 0.0025 ");

	}

}
