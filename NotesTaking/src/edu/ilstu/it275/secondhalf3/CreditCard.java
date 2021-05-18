/**
 * 
 */
package edu.ilstu.it275.secondhalf3;

/**
 * @author eagye
 *
 */
public class CreditCard {



	/**
	 * @param args
	 */
    private double currentBalanceOwed;
    
    public void makePurchase(int amountOfPurchase) {
    	
    	currentBalanceOwed+=Math.abs(amountOfPurchase);
	}
	public double getCurrentBalanceOwed() {
		return currentBalanceOwed;
	}
}
