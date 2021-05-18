/**
 * 
 */
package edu.ilstu.it275.lab08.eagyem2;

import java.util.ArrayList;

/**
 * @author eagyem2
 * 
 *This is a class of cash register for testing the total of sales and
 *compute change
 *
 */
public class CashRegister {
	// Declaring the attributes of this class
	private ArrayList<Coin> typeOfCoin;
	private double purchase;
	private double payment;

	// Construct a cash register with an allocated memory for the arrayList
	public CashRegister() {
		typeOfCoin = new ArrayList<Coin>();
	}

	// Declaring constructors for the class
	public CashRegister(double purchase, double payment) {
		this.purchase = purchase;
		this.payment = payment;
	}

	// We obtain the total amount in the cash register and produce the total amount
	// in it.
	public double getTotalValue() {
		double total = 0;
		if (typeOfCoin.size() == 0) {
			return 0.0;
		}
		for (int i = 0; i < typeOfCoin.size(); i++) {
			total += typeOfCoin.get(i).getValue();
		}
		return total;
	}

	// Record the purchase price of an item with amount been the parameter of the
	// record purchase
	public void recordPurchase(double amount) {
		purchase += amount;
	}

	// Processes the payment received from the customer based on the coin count and
	// coin type
	public void receivePayment(int coinCount, Coin coinType) {
		typeOfCoin.add(coinType);
		payment += coinCount * coinType.getValue();

	}

	// Computes the change due and resets the machine for the next customer
	// We return the change due to the customer
	public double giveChange() {
		double change = payment - purchase;
		if (payment==purchase) {
			System.out.print("you do not get a change with this payment amount! ");
		}else if(payment<purchase){
			System.out.print("You dont get a change! Instead you owe us: "+ Math.abs(change)+";");
		}else {
			System.out.print("You get a change! ");
		}
		purchase = 0;
		payment = 0;
		return change;
	}
}
