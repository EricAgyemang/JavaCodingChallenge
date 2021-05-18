/**
 * 
 */
package edu.ilstu.it275.secondhalf3;

/**
 * @author eagyem2
 *
 */
public class Balloon {
private int radius;

public int getRadius() {
	return radius;
}

public void inflate(int amount) {
	radius+=Math.abs(amount);
}
}
