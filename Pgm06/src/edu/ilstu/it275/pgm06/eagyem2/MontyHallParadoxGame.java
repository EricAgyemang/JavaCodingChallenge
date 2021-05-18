/**
 * 
 */
package edu.ilstu.it275.pgm06.eagyem2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author eagyem2
 * 
 *         This is a class of Monty Hall paradox Game that accept an input from
 *         the user with a host asking if the user will switch to a different
 *         choice in order to with a prize door
 */
public class MontyHallParadoxGame {

	/**
	 * @param args
	 * The main method is declared as main
	 */
	public static void main(String[] args) {
		// creating random case object for the randomly generation of numbers
		Random randCase = new Random();

		// Declaring the scanner class to allow the user input values for the simulation
		Scanner input = new Scanner(System.in);
		// initializing variable for iteration and the two strategies
		int iterate = 1000;
		int strategyOne = 0;
		int strategyTwo = 0;
		
		System.out.println("Hello, YOU ARE WELCOME BACK TO THE MONTY GAME Wellcome To The Monty Game Show, Is All About Fun !!!");
		// Now having a 1000 iterations, we use the for loop
		for (int j = 1; j <= iterate; j++) {
			// We generate three doors 1 to 3 for the game and fix the price in one of the
			// doors
			System.out.println("\nThe host is picking a random door for placing in a car!!");
			int doorWithPrice = randCase.nextInt(3) + 1;

			System.out.println("A car has been placed behind the door!!!");
			System.out.println("player, pick at random from the doors!!!");
			int doorPickedByPlayer = randCase.nextInt(3) + 1;

			System.out.println("Wao our contestant has pick door: " + doorPickedByPlayer);

			// We let the host pick a random door which is not the door picked by the
			// contestant
			int doorPickedByHost = randCase.nextInt(3) + 1;
			while ((doorPickedByHost == doorWithPrice) || (doorPickedByHost == doorPickedByPlayer)) {
				doorPickedByHost = randCase.nextInt(3) + 1;
			}
			System.out.println("Wao, the host has picked door " + doorPickedByHost + " with a goat behind it!");
			// Now for the to open another doors which is neither door picked by player nor
			// host,
			int openAnotherDoor = randCase.nextInt(3) + 1;
			while ((openAnotherDoor == doorPickedByPlayer) || (openAnotherDoor == doorPickedByHost)) {
				openAnotherDoor = randCase.nextInt(3) + 1;
			}

			// We ask the contestant if he will make a decision to switch to another door
			System.out.println("Dear contestant, do you want to pick door Number " + openAnotherDoor + "? "+" Please answer (yes/no)");

			String playerDecision = input.nextLine();
			if (playerDecision.equals("yes")) {
				doorPickedByPlayer = openAnotherDoor;
				if (doorPickedByPlayer == doorWithPrice) {
					System.out.println("Waooo, this player has won a car for this game!!!");
					strategyOne++;
				} else {
					System.out.println("Oh this player has loses the game!");
				}
			} else if (playerDecision.equals("no")) {
				if (doorPickedByPlayer == doorWithPrice) {
					System.out.println("Wao this player has won a car for this game!!!");
					strategyTwo++;
				} else {
					System.out.println("Oh this player has loses the game!");
				}
			} else {
				System.out.println("Invalid Selection, Please select the right door according to the instruction given");
			}
           
			// We display the two strategy counters
			System.out.println("Strategy 1 counter: " + strategyOne);
			System.out.println("Strategy 2 counter: " + strategyTwo);
			
		}
		input.close();
	}
}
