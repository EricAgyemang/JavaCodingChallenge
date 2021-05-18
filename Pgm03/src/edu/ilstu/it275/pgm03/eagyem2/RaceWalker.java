/**
 * 
 */
package edu.ilstu.it275.pgm03.eagyem2;

/**
 * @author eagyem2
 * This is a class of Race Walker that models a race walker moving along a horizontal line
 */
public class RaceWalker {
	// declaring and initializing the attributes of the class
	private int position;
	private int direction =1;
	
	// providing the constructor below
	public RaceWalker(int initialPosition) {
		  position=initialPosition;
	}
	
	// providing for the direction whether turning left or right 
	public void turn() {
		direction = (direction == 1)?-1:1;	
	}
	
	// providing the movement instances of the walker
	public void move() {
		  position+=direction;
		
	}

	//The get method on position
	public int getPosition() {
		return position;
	}

}
