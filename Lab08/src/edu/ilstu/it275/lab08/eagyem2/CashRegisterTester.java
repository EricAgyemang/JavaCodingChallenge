/**
 * 
 */
package edu.ilstu.it275.lab08.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of cash register tester for testing the total of
 * sales and computed change due
 *
 */
public class CashRegisterTester {

	/**
	 * @param args
	 * 
	 * The main method is declared as main
	 */
	public static void main(String[] args) {
		// We invoke the cash register class here
		CashRegister register = new CashRegister();

		// Calling the record purchase method with dollar and dime payment
		register.recordPurchase(0.75);
		register.recordPurchase(1.50);

		// Invoking the method multiple times, once for each type of coin that is
		// present in the payment
		// Calling to Processes the payment received from the customer based on the coin
		// count and coin type
		register.receivePayment(1, new Coin(5, "dime"));
		register.receivePayment(1, new Coin(2, "dollar"));

		// We print out the output of the total in the register
		System.out.print("For dollar and dime present in the payment, the total in the register is: "
				+ register.getTotalValue() + " \nExpected is 2.5\n");

		// We print out the change when one purchase with dime and dollar with their
		// respective amount
		System.out.println("The change in this transaction is: " + register.giveChange() + " \nExpected is: 0.25");

		// Calling the record purchase method for the purchase with dollar and quarter payments
		register.recordPurchase(2.25);
		register.recordPurchase(19.25);
		register.receivePayment(1, new Coin(23, "dollar"));
		register.receivePayment(2, new Coin(2, "quarter"));

		System.out.print("\nFor dollar and quarte present in the payment, the total in the register is: "
				+ register.getTotalValue() + " \nExpected is 26.0\n");

		// print out the change
		System.out.println("The change in this transaction is: " + register.giveChange() + " \nExpected is: 2.5");

		// Calling the record purchase method for the the purchase payment with dollars, nickel, and penny
		register.recordPurchase(20.0);
		register.recordPurchase(12.0);
		register.recordPurchase(9.0);
		register.receivePayment(1, new Coin(16, "dollar"));
		register.receivePayment(1, new Coin(8, "nickel"));
		register.receivePayment(1, new Coin(9, "penny"));
		System.out.print("\nFor dollars, nickels, and pennys present in the payment, the total in the register is: "
				+ register.getTotalValue() + " \nExpected is 42.49\n");

		// print out the change in this transaction
		System.out.println(" The change in this transaction is: " + register.giveChange() + " \nExpected is: -24.51");

	}

}
