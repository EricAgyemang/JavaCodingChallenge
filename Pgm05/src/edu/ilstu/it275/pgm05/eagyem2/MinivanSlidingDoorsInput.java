/**
 * 
 */
package edu.ilstu.it275.pgm05.eagyem2;

import java.util.Scanner;

/**
 * @author eagyem2
 * 
 *         This is a class of Minivan dashboard control that regulate all
 *         switches to determine the status of the doors of the van
 */
public class MinivanSlidingDoorsInput {

	/**
	 * @param args
	 * 
	 *             The main class is declared as main
	 */
	public static void main(String[] args) {

		// Declaring the scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter '0' for OFF and '1' for Activate");

		System.out.println("Dashboard switch for the left: ");
		int dashBoardLeftSwitch = Integer.parseInt(input.nextLine());

		System.out.println("Dashboard switch for the right: ");
		int dashBoardRightSwitch = Integer.parseInt(input.nextLine());

		System.out.println("Child Lock switch: ");
		int childLockSwitch = Integer.parseInt(input.nextLine());

		System.out.println("Master Lock switch: ");
		int masterUnlockSwitch = Integer.parseInt(input.nextLine());

		System.out.println("Inside left switch: ");
		int insideLeftHandleSwitch = Integer.parseInt(input.nextLine());

		System.out.println("Outside left switch: ");
		int outsideLeftHandleSwitch = Integer.parseInt(input.nextLine());

		System.out.println("Inside right switch:");
		int insideRightHandleSwitch = Integer.parseInt(input.nextLine());

		System.out.println("Outside right switch: ");
		int outsideRightHandleSwitch = Integer.parseInt(input.nextLine());

		System.out.println("gear shift lock, Please enter any of P,N,D,1,2,3,R: ");
		String gearShift = input.nextLine();

		input.close();

		// Calling all methods
		MinivanDashboardControl minivan = new MinivanDashboardControl();

		// Returning the vlue calls
		minivan.setDashBoardLeftSwitch(dashBoardLeftSwitch);
		minivan.setDashBoardRightSwitch(dashBoardRightSwitch);
		minivan.setChildLockSwitch(childLockSwitch);
		minivan.setMasterUnlockSwitch(masterUnlockSwitch);
		minivan.setInsideLeftHandleSwitch(insideLeftHandleSwitch);
		minivan.setInsideRightHandleSwitch(insideRightHandleSwitch);
		minivan.setOutsideLeftHandleSwitch(outsideLeftHandleSwitch);
		minivan.setOutsideRightHandleSwitch(outsideRightHandleSwitch);
		minivan.setGearShift(gearShift);

		System.out.println("Your input that for the above simulation is: " + dashBoardLeftSwitch + " "
				+ dashBoardRightSwitch + " " + childLockSwitch + " " + masterUnlockSwitch + " " + insideLeftHandleSwitch
				+ " " + outsideLeftHandleSwitch + " " + insideRightHandleSwitch + " " + outsideRightHandleSwitch + " "
				+ gearShift);

		// Printing out the output
		System.out.println("The " + minivan.leftDoorOpens());

	}
}
