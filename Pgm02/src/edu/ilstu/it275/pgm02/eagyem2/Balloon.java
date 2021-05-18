/**
 * 
 */
package edu.ilstu.it275.pgm02.eagyem2;

/**
 * @author eagyem2
 * This is a class of Balloon. This class contains the radius of the balloon which helps us to determine the volume
 * of the balloon when the radius is increased.
 */
public class Balloon {
    //Declaring and authomatically initializing the attribute of the class to 0
	private double radius;

	//This method increase the radius by a given amount
	public void inflate(double amount) {
		radius += amount;
	}
    
	//This method returns the current volume of the balloon.
	public double getVolume() {
		double volume = 4 * (Math.PI) * (radius * radius * radius) / 3;
		return volume;
	}

	/**
	 * @param args
	 * The main method is declared as main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking the class Balloon here.
		Balloon balloon = new Balloon();
		
		//We print out the initial volume of the balloon if it is not inflated
		System.out.println("The initial volume of the balloon is: " + balloon.getVolume());

		//We inflate the balloon by increasing the radius by 20
		balloon.inflate(20);
		
		//we print out the volume of the balloon after inflating and increasing the radius by 20
		System.out.println("Volume after increasing the radius by 20 is :" + balloon.getVolume());
	}

}
