/**
 * 
 */
package edu.ilstu.it275.pgm10.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of DecimalSeparatorFormatter that implements the
 * NumberFormatter interface
 *
 */
public class DecimalSeparatorFormatter implements NumberFormatter {

	/**
	 * We implements the format() method form the interface
	 */

	@Override
	public String format(int n) {

		String seperator = Integer.toString(n);
		StringBuffer stemp = new StringBuffer(seperator);
		stemp.reverse();

		StringBuffer temp = new StringBuffer();
		// We use the for loop to get the positions of the decimal place values in the
		// number
		// and introduce a comma in between decimal place values
		for (int i = 0; i < stemp.length(); i++) {
			char charactor = stemp.charAt(i);
			temp.append(charactor);
			if ((i + 1) % 3 == 0) {
				temp.append(',');
			}
		}
		// We return the results in a string
		return temp.reverse().toString();
	}

}
