/**
 * 
 */
package edu.ilstu.it275.seondhalf;

/**
 * @author eagye
 *
 */
public class Studying {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] intArray1 = {3,4,7,9,13};
		int [] intArray2 = intArray1;
		
		intArray2[0]=10;
		for(int i:intArray1) {
			System.out.println(i+ "");
		}
	    
		

		
	}

}
