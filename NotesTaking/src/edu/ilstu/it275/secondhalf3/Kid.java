/**
 * 
 */
package edu.ilstu.it275.secondhalf3;

/**
 * @author eagye
 *
 */
public class Kid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Balloon redOne = new Balloon();
System.out.println("r= "+redOne.getRadius());

redOne.inflate(100);
System.out.println("r= "+ redOne.getRadius());

redOne.inflate(-10);
System.out.println("r= "+redOne.getRadius());
	}

}
