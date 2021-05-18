/**
 * 
 */
package edu.ilstu.it275.pgm10.eagyem2;

/**
 * @author eagyem2
 * 
 * this is the DefaultFormater class that implements the NumberFormatter
 * interface to format a given input of number in the usual default
 * format
 *
 */
public class DefaultFormatter implements NumberFormatter {

	/**
	 * We implements the format method from the interface.
	 */
	@Override
	public String format(int n) {
		String retVal = Integer.toString(n);

		// We return the results as retVal.
		return retVal;
	}

}
