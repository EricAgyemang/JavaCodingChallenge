/**
 * 
 */
package edu.ilstu.it275.pgm03.eagyem2;

/**
 * @author eagyem2 The circuit tester class tests all witch combinations, print
 *         out actual and expected states for the switches and light.
 */
public class CircuitTester {

	/**
	 * @param args The main method is declared below as main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking the Circuit class here
		Circuit circuit = new Circuit();

		// Print the state of the light
		System.out.println("State of light: " + "\n" + circuit.getLightState() + "\n");

		// Toggle first switch
		circuit.toggleSwitch(1);
		System.out.println("After toggling the first switch, the state of the light is:" + "\n" + circuit.getLightState() + "\n");

		// call toggle switch
		circuit.toggleSwitch(1);
		System.out.println("After toggling the second switch, the stat of the light is: " + "\n"+ circuit.getLightState() + "\n\n");

		
		
		
		// The initial state of the circuit is displayed where the switches with the
		// light states are shown
		System.out.println("The initial states of the two switches when all switches are put to 0 and the state of the light:");
		// Display the initial status of the first switch state
		System.out.println("Actual state of first switch :" + circuit.getFirstSwitchState() + "\n" + "Expected state : 0");
		// Display the initial status of the second switch
		System.out.println("Actual state of second switch :" + circuit.getSecondSwitchState() + "\n" + "Expected state : 0");
		// Return the initial state of the light when both switches are off, 1 for on
		// and 0 for off
		System.out.println("Light state: " + circuit.getLightState() + "\n" + "Expected state : 0" + "\n");

		
		
		
		// calling the toggle first switch, we display the status of the switches and
		// the light
		System.out.println("Displaying the status of the circuit after toggling the first switch: ");
		circuit.toggleFirstSwitch();
		System.out.println("Actual state of first switch :" + circuit.getFirstSwitchState() + "\n" + "Expected state : 1");
		System.out.println("Actual state of second switch :" + circuit.getSecondSwitchState() + "\n" + "Expected state : 0");
		System.out.println("After toggling first switch, actual state of light is: " + circuit.getLightState() + "\n"
				+ "Expected state : 1" + "\n");

		
		
		
		// Toggling the first switch back while the second switch is at it's initial
		// position
		// call toggle first switch
		System.out.print("Toggling first switch to its initial position 0, while second switch is still at 0" + "\n");
		circuit.toggleFirstSwitch();
		// Return the state of the light, 1 for on and 0 for off
		System.out.println("The actual state of the first switch is: " + circuit.getFirstSwitchState() + "\n"+ "Expected state : 0");
		System.out.println("Actual state of second switch :" + circuit.getSecondSwitchState() + "\n" + "Expected state : 0");
		System.out.println("The actual state of the light is: " + circuit.getLightState() + "\n" + "Expected state : 0" + "\n");

		
		
		
		// Toggling the second switch
		// calling the toggle first switch
		System.out.println("Toggling the second switch, while the first swite is at 0");
		circuit.toggleSecondSwitch();
		System.out.println("The actual state of the first switch is: " + circuit.getFirstSwitchState() + "\n"+ "Expected state : 0");
		System.out.println("Actual state of second switch :" + circuit.getSecondSwitchState() + "\n" + "Expected state : 1");
		System.out.println("After toggling second switch, actual state of light is: " + circuit.getLightState() + "\n"
				+ "Expected state : 1" + "\n");

		
		
		// Toggling both switches
		// call toggle first switch
		System.out.println("Toggling the first switch to 1, while the  second switches is still at 1:");
		circuit.toggleFirstSwitch();
		// Return the state of the light, 1 for on and 0 for off
		System.out.println("The actual state of the first switch is: " + circuit.getFirstSwitchState() + "\n"+ "Expected state : 1");
		System.out.println("Actual state of second switch :" + circuit.getSecondSwitchState() + "\n" + "Expected state : 1");
		System.out.println("After toggling both switchs, actual state of light is: " + circuit.getLightState() + "\n"
				+ "Expected state : 1" + "\n");

	}

}
