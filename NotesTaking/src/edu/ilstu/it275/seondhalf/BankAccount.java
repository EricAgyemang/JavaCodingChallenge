/**
 * 
 */
package edu.ilstu.it275.seondhalf;

/**
 * @author eagye
 *
 */
public class BankAccount {

	/**
	 * @param args
	 */
	private double balance;
	private int accountNumber;
	private static int lastAssignedNumber = 1000;
	
	
	public BankAccount () {
		lastAssignedNumber ++;
		accountNumber = lastAssignedNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public static int getLastAssignedNumber() {
		return lastAssignedNumber;
	}
	
	
	public static void main(String[] args) {
      BankAccount account1 = new BankAccount();
    //  BankAccount acccount2 = new BankAccount();
      System.out.println(BankAccount.getLastAssignedNumber());
	  System.out.println(account1.getLastAssignedNumber());	
		System.out.println(account1.getAccountNumber());
	}

}
