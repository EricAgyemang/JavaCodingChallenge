/**
 * 
 */
package edu.ilstu.it275.pgm02.eagyem2;

/**
 * @author eagyem2 This class is a Battery class and it models a rechargeable
 *         battery.
 */
public class Battery {
	// declaring and automatically initializing the attributes of the class
	private double capacity;
	private double originalCapacity;

	// Declaring the contractor and calling it as well
	public Battery(double capacity) {
		this.capacity = capacity;
		this.originalCapacity = capacity;
	}

	// this method drains the capacity of the battery by the given amount
	public void drain(double amount) {
		capacity -= amount;
		if (capacity < 0) {

			capacity = 0;
		}
	}

	// This method declared charges the battery to its original capacity
	public void charge() {
		capacity = originalCapacity;
	}

	// This method gets the remaining capacity of the battery
	public double getRemainingCapacity() {
		return capacity;
	}

	/**
	 * @param args the main method is declared as main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We look at cases where the AA battery has a capacity of 2000
		Battery battery1 = new Battery(2000);
		// we print out the remaining capacity
		System.out.println("Battery capacity is: " + battery1.getRemainingCapacity() + " milliampere hours" + "\n");

		// if the battery is drained by an amount of 150
		battery1.drain(150);
		// we print out the remaining capacity
		System.out.println("When the capacity of the battery is drained by 150, the Battery's remaining capacity is: "
				+ battery1.getRemainingCapacity() + " milliampere hours." + "\n");

		// if the battery is drained by an amount of 3000
		battery1.drain(3000);
		// we print out the remaining capacity
		System.out.println("When the capacity of the battery is drained by 3000, the Battery's remaining capacity is: "
				+ battery1.getRemainingCapacity() + " milliampere hours." + "\n");

		// if the battery is charged to its original capacity
		battery1.charge();
		// we print out the remaining capacity
		System.out.println("When the battery is charged to its original position, the Battery's remaining capacity is: "
				+ battery1.getRemainingCapacity() + " milliampere hours." + "\n\n");

		// We look at cases where the AA battery has a capacity of 3000
		Battery battery2 = new Battery(3000);
		// we print out the remaining capacity
		System.out.println("Battery capacity is: " + battery2.getRemainingCapacity() + " milliampere hours" + "\n");

		// if the battery is drained by an amount of 150
		battery2.drain(150);
		// we print out the remaining capacity
		System.out.println("When the capacity of the battery is drained by 150, the Battery's remaining capacity is: "
				+ battery2.getRemainingCapacity() + " milliampere hours." + "\n");

		// if the battery is drained by an amount of 4000
		battery2.drain(4000);
		// we print out the remaining capacity
		System.out.println("When the capacity of the battery is drained by 4000, the Battery's remaining capacity is: "
				+ battery2.getRemainingCapacity() + " milliampere hours." + "\n");

		// if the battery is charged to its original capacity
		battery2.charge();
		// we print out the remaining capacity
		System.out.println("When the battery is charged to its original position, the Battery's remaining capacity is: "
				+ battery2.getRemainingCapacity() + " milliampere hours.");

	}
}
