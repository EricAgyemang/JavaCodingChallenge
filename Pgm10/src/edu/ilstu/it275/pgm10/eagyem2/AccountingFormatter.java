/**
 * 
 */
package edu.ilstu.it275.pgm10.eagyem2;

/**
 * @author eagyem2
 *
 *this is a class of AccoutningFormatter that implements the NumberFormatter interface
 */
public class AccountingFormatter implements NumberFormatter {
	/**
	 * We implement the format() method from the interface
	 * 
	 */
	@Override
	public String format(int n) {
	    
		String separator = Integer.toString(n);
		
		StringBuffer stemp = new StringBuffer (separator);
		
		stemp.deleteCharAt(0);
		
		StringBuffer temp = new StringBuffer();
		
		//Setting the positions of the brackets in place of the negative sign
		temp.append('(');
		
		temp.append(stemp);
		
		temp.append(')');
		
		//We return the results in the form of a string
		return temp.toString();
	}

}
