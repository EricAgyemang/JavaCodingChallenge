/**
 * 
 */
package edu.ilstu.it275.pgm03.eagyem2;

/**
 * @author eagyem2
 * This is a Race walker tester class that construct a race walker, 
 * makes it move and turn tests a few times, and prints the actual and expected position 
 */
public class RaceWalkerTester {

	/**
	 * @param args
	 * The main methods is declared as main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// invoking the Race Walker class inputing 10 steps into it
		RaceWalker raceWalker = new RaceWalker(10);
		
		//print out the actual and expected position of the walker after the move
		System.out.println("Current Position :" + raceWalker.getPosition());
		System.out.println("Moving");
		raceWalker.move(); // now is at position 11
		
		//printing out the actual and expected position of the walker 
		System.out.println("Current Position :" + raceWalker.getPosition());
		System.out.println("turning");
		raceWalker.turn();
		
		//printing out the actual and expected position of the walker 
		System.out.println("Moving");
		raceWalker.move(); // now is at position 10
		System.out.println("Current Position :" + raceWalker.getPosition());
		
	}

}
