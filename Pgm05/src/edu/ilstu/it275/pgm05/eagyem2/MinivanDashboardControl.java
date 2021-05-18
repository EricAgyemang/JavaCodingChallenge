/**
 * 
 */
package edu.ilstu.it275.pgm05.eagyem2;

/**
 * @author eagyem2
 * 
 *         This is an array class of Minivan door input values that accepts
 *         input from the user
 */
public class MinivanDashboardControl {
	private int dashBoardLeftSwitch;
	private int dashBoardRightSwitch;
	private int childLockSwitch;
	private int masterUnlockSwitch;
	private int insideLeftHandleSwitch;
	private int insideRightHandleSwitch;
	private int outsideLeftHandleSwitch;
	private int outsideRightHandleSwitch;
	private String gearShift;

	/**
	 * declaring getters and setters
	 * 
	 * @return the dashBoardLeftSwitch
	 * 
	 */
	public int getDashBoardLeftSwitch() {
		return dashBoardLeftSwitch;
	}

	/**
	 * @param dashBoardLeftSwitch the dashBoardLeftSwitch to set
	 */
	public void setDashBoardLeftSwitch(int dashBoardLeftSwitch) {
		this.dashBoardLeftSwitch = dashBoardLeftSwitch;
	}

	/**
	 * @return the dashBoardRightSwitch
	 */
	public int getDashBoardRightSwitch() {
		return dashBoardRightSwitch;
	}

	/**
	 * @param dashBoardRightSwitch the dashBoardRightSwitch to set
	 */
	public void setDashBoardRightSwitch(int dashBoardRightSwitch) {
		this.dashBoardRightSwitch = dashBoardRightSwitch;
	}

	/**
	 * @return the childLockSwitch
	 */
	public int getChildLockSwitch() {
		return childLockSwitch;
	}

	/**
	 * @param childLockSwitch the childLockSwitch to set
	 */
	public void setChildLockSwitch(int childLockSwitch) {
		this.childLockSwitch = childLockSwitch;
	}

	/**
	 * @return the masterUnlockSwitch
	 */
	public int getMasterUnlockSwitch() {
		return masterUnlockSwitch;
	}

	/**
	 * @param masterUnlockSwitch the masterUnlockSwitch to set
	 */
	public void setMasterUnlockSwitch(int masterUnlockSwitch) {
		this.masterUnlockSwitch = masterUnlockSwitch;
	}

	/**
	 * @return the insideLeftHandleSwitch
	 */
	public int getInsideLeftHandleSwitch() {
		return insideLeftHandleSwitch;
	}

	/**
	 * @param insideLeftHandleSwitch the insideLeftHandleSwitch to set
	 */
	public void setInsideLeftHandleSwitch(int insideLeftHandleSwitch) {
		this.insideLeftHandleSwitch = insideLeftHandleSwitch;
	}

	/**
	 * @return the insideRightHandleSwitch
	 */
	public int getInsideRightHandleSwitch() {
		return insideRightHandleSwitch;
	}

	/**
	 * @param insideRightHandleSwitch the insideRightHandleSwitch to set
	 */
	public void setInsideRightHandleSwitch(int insideRightHandleSwitch) {
		this.insideRightHandleSwitch = insideRightHandleSwitch;
	}

	/**
	 * @return the outsideLeftHandleSwitch
	 */
	public int getOutsideLeftHandleSwitch() {
		return outsideLeftHandleSwitch;
	}

	/**
	 * @param outsideLeftHandleSwitch the outsideLeftHandleSwitch to set
	 */
	public void setOutsideLeftHandleSwitch(int outsideLeftHandleSwitch) {
		this.outsideLeftHandleSwitch = outsideLeftHandleSwitch;
	}

	/**
	 * @return the outsideRightHandleSwitch
	 */
	public int getOutsideRightHandleSwitch() {
		return outsideRightHandleSwitch;
	}

	/**
	 * @param outsideRightHandleSwitch the outsideRightHandleSwitch to set
	 */
	public void setOutsideRightHandleSwitch(int outsideRightHandleSwitch) {
		this.outsideRightHandleSwitch = outsideRightHandleSwitch;
	}

	/**
	 * @return the gearShift
	 */
	public String getGearShift() {
		return gearShift;
	}

	/**
	 * @param gearShift the gearShift to set
	 */
	public void setGearShift(String gearShift) {
		this.gearShift = gearShift;
	}

	// Declaring methods here
	// The method for left door open

	public String leftDoorOpens() {
		if (gearShift.equals("P") && masterUnlockSwitch == 1 && childLockSwitch == 0 && insideLeftHandleSwitch == 1
				|| dashBoardLeftSwitch == 1 || outsideLeftHandleSwitch == 1)
			;
		return "Left door opens";
	}

	// the method for right door open
	public String rightDoorOpens() {
		if (gearShift.equals("P") && masterUnlockSwitch == 1 && childLockSwitch == 0 && insideRightHandleSwitch == 1
				|| dashBoardRightSwitch == 1 || outsideRightHandleSwitch == 1)
			;
		return "Right door opens";
	}

	// the method for both door closed
	public String bothDoorsStayClosed() {
		if (!gearShift.equals("P") || masterUnlockSwitch == 0 && childLockSwitch == 1 && insideRightHandleSwitch == 1
				|| dashBoardRightSwitch == 1 || outsideRightHandleSwitch == 1)
			;
		return "Both doors stay closed";
	}

}