/**
 * 
 */
package edu.ilstu.it275.pgm10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is the NumberSeparaterTester class that prints out the results
 *  of the test of each formatted format
 *
 */
public class NumberSeparaterTester {

	// We declare constants here
	public static final int SMALL_NUM = 80000;
	public static final int NEGETIVE_NUM = -1000;
	public static final int LARGE_NUM = 1000000;

	/**
	 * The main method is declared here as main
	 * 
	 */
	public static void main(String[] args) {

		// We invoke the Accounting Formatter class here
		NumberFormatter numFormat = new AccountingFormatter();

		// We put in the constant NEGETIVE_NUM to evaluate the number formatter
		String format = numFormat.format(NEGETIVE_NUM);
		System.out.println("The Accounting formatted format for " + NEGETIVE_NUM + " is: " + format);

		// We invoke the Decimal Separator formatter here to be used to evaluate that
		// formatter
		NumberFormatter numFormatter = new DecimalSeparatorFormatter();
		// We put in the constant LARGE_NUM to evaluate the number formatter
		String formatter = numFormatter.format(LARGE_NUM);
		System.out.println("\nThe Decimal separator formatted for " + LARGE_NUM + " is: " + formatter);

		// Also putting in a negative number to check the decimal formatter
		String formatter2 = numFormatter.format(NEGETIVE_NUM);
		System.out.println("\nThe Decimal separator formatted for " + NEGETIVE_NUM + " is: " + formatter2);

		// We invoke the Default formatter here to be used to evaluate that formatter
		NumberFormatter numForm = new DefaultFormatter();
		// We put in the SMALL_NUM formatter
		String defaultNum = numForm.format(SMALL_NUM);
		System.out.println("\nThe Default formatted for " + SMALL_NUM + " is: " + defaultNum);

		// Also putting in a negative number to check the decimal formatter
		String defaultNum2 = numForm.format(NEGETIVE_NUM);
		System.out.println("\nThe Default formatted for " + NEGETIVE_NUM + " is: " + defaultNum2);

	}

}
