/**
 * 
 */
package edu.ilstu.it275.pgm03.eagyem2;

/**
 * @author eagyem2 This is a Circuit class for controlling a hallway light that
 *         has switches at both ends of the hallway
 *
 */
public class Circuit {
	// Declaring the attributes and automatically initializing it
	private int firstSwitchState;
	private int secondSwitchState;
	private int lightState;

	/**
	 * @return the firstSwitchState Declaring the get first switch method
	 */
	public int getFirstSwitchState() {
		return firstSwitchState;
	}

	/**
	 * @return the secondSwitchState Declaring the get second switch method
	 */
	public int getSecondSwitchState() {
		return secondSwitchState;
	}

	/**
	 * @return the lightState Declaring the get light method
	 */
	public int getLightState() {
		return lightState;
	}

	// Declaring the the toggle first switch method
	public void toggleFirstSwitch() {
		if (firstSwitchState == 0) {
			firstSwitchState = 1;
			lightState = 1;
		} else {
			firstSwitchState = 0;
			lightState = 0;
		}
	}

	// Declaring the the toggle second switch method
	public void toggleSecondSwitch() {
		if (secondSwitchState == 0) {
			secondSwitchState = 1;
			lightState = 1;
		} else {
			firstSwitchState = 0;
			lightState = 0;
		}
	}

	// Declaring the the get switch state method
	public int getSwitchState(int switchState) {
		int state = 0;
		if (switchState == 1)
			state = firstSwitchState;
		else if (switchState == 2)
			state = secondSwitchState;

		return state;

	}

	// Declaring the the toggle switch method
	public void toggleSwitch(int switchState) {
		if (switchState == 1) {
			if (firstSwitchState == 0) {
				firstSwitchState = 1;
				lightState = 1;
			} else {
				firstSwitchState = 0;
				lightState = 0;
			}
		} else if (switchState == 2) {
			if (secondSwitchState == 0) {
				secondSwitchState = 1;
				lightState = 1;
			} else {
				secondSwitchState = 0;
				lightState = 0;
			}
		}
	}

}
