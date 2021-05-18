/**
 * 
 */
package edu.ilstu.it275.secondhalf3;

/**
 * @author eagye
 *
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreditCard amex = new CreditCard();
		
		amex.makePurchase(100);
		amex.makePurchase(50);
		System.out.println(amex.getCurrentBalanceOwed());
		
		amex.makePurchase(-1000);
		System.out.println(amex.getCurrentBalanceOwed());
	}

}
