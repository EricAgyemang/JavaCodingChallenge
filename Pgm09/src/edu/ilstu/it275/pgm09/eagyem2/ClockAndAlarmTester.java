/**
 * 
 */
package edu.ilstu.it275.pgm09.eagyem2;

/**
 * @author eagyem2
 *This is the class of clock and alarm tester that test the local time
 */
public class ClockAndAlarmTester {

	/**
	 * @param args
	 * 
	 * The main method is declared here as main
	 */
	public static void main(String[] args) {
    Clock clock = new Clock();
    
    
    System.out.println("The hour now is: "+ clock.getHours()+ "\nThe minutes now is: "+ clock.getMinutes());
    System.out.println("The time now is: "+ clock.getTime());
    
    //We set the alarm time here
    clock.setAlarm(21, 48);
    

	}

}
