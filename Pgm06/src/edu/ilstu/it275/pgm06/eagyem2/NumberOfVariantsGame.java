/**
 * 
 */
package edu.ilstu.it275.pgm06.eagyem2;

import java.util.Random;
import java.util.Scanner;
/**
 * @author eagyem2
 * 
 * This is a class of number of variant game that allow two players
 * alternately take marbles from a pile
 */
public class NumberOfVariantsGame {

	/**
	 * @param args
	 * 
	 *The main class is declared here as main
	 * 
	 */

	public static void main(String[] args) {

		// We generate random numbers
		Random randomNum = new Random();
	
		// We generate numbers at random between 0 or 1 to decide first play
		int firstTurn = randomNum.nextInt(2);

		// We generate numbers at random between 10 or 100
		int randIntergerGeneration = randomNum.nextInt(91) + 10;

		// We generate numbers at random between 0 or 1 to decide second play
		int playSmartOrStupid = randomNum.nextInt(2);
		nowStartingToPlay(firstTurn, randIntergerGeneration, playSmartOrStupid);
		gameCurrentlyPlaying(firstTurn, randIntergerGeneration, playSmartOrStupid);
		
	}

	// We declare the currently playing method with parameters
	public static void gameCurrentlyPlaying(int decideTurning, int sizeOfPile, int legal) {
		// Initializing the switch checking variable in this class

		int switchCkecking = sizeOfPile;

		// Using the while loop we obtain the currently playing
		while (sizeOfPile > 0) {

			if (decideTurning == 0) {
				if (legal == 0) {
					sizeOfPile = computerPlayingSmart(sizeOfPile);
				} else {
					sizeOfPile = computerPlayingStupid(sizeOfPile);
				}
			} else {
				sizeOfPile = humanPlays(sizeOfPile);
			}

			if (switchCkecking != sizeOfPile) {
				if (decideTurning == 0) {
					decideTurning = 1;
				} else {
					decideTurning = 0;
				}
				switchCkecking = sizeOfPile;
			}
		}
		// Displaying the winner of this game as conditions are fulfilled

		if (decideTurning == 0) {
			System.out.println("Human took the last marble. Computer wins beating you!!");
		} else {
			System.out.println("Computer took the last marble. Human wins beating the computer!!");
		}
	}

//Now setting the human play at this mode and we declare humanPlays method here
	public static int humanPlays(int boardOfSize) {
       
      
		System.out.println("THE CURRENT BOARD SIZE IS AT " + boardOfSize);
		Scanner input = new Scanner(System.in);
				
		if (boardOfSize > 3) {
			System.out.println("Please enter a number between 1 and " + (boardOfSize / 2) + ": ");
		
			int marblesTakenOff = input.nextInt();
			
			if (marblesTakenOff < 1 || marblesTakenOff > (boardOfSize / 2)) {

				System.out.println("Invalid amount taken.");
			} else {

				return boardOfSize-marblesTakenOff;
			}

		} else {
			System.out.println("Please enter the number 1 to move on: ");
		
		    int marblesLeft = input.nextInt();
			if (marblesLeft < 1 || marblesLeft > 1) {
				System.out.println("Invalid number of marbles taken.");

			} else {
				return boardOfSize-marblesLeft;
			}
			
		}
		
		return boardOfSize;
		
		
	}
	
	// Computer is set to playing in the smart mode at the current play and we
	// declare the
	// computerPlayingSmart method here
	public static int computerPlayingSmart(int sizeOfPile) {
		int numOfMarblesInSmart = 1;
		if (sizeOfPile == 63 || sizeOfPile == 31 || sizeOfPile == 15 || sizeOfPile == 7 || sizeOfPile == 3) {
			Random smartThinking = new Random();
			numOfMarblesInSmart = smartThinking.nextInt(sizeOfPile / 2) + 1;
		} else if (sizeOfPile > 63) {
			numOfMarblesInSmart = sizeOfPile - 63;
		} else if (sizeOfPile > 31) {
			numOfMarblesInSmart = sizeOfPile - 31;
		} else if (sizeOfPile > 15) {
			numOfMarblesInSmart = sizeOfPile - 15;
		} else if (sizeOfPile > 7) {
			numOfMarblesInSmart = sizeOfPile - 7;
		} else if (sizeOfPile > 3) {
			numOfMarblesInSmart = sizeOfPile - 3;
		}
		System.out.println("The computer took " + numOfMarblesInSmart + " of " + sizeOfPile + " marbles. " + "\n");
		return sizeOfPile - numOfMarblesInSmart;
	}

	// The computer is now set to playing stupid mode and we declare
	// computerPlayingStupid method here
	public static int computerPlayingStupid(int sizeOfthePilesLeft) {
		int numOfMarblesInStupid = 1;
		if (sizeOfthePilesLeft > 3) {
			// Generate random legal values between 1 and n/2
			Random stupidThinking = new Random();
			numOfMarblesInStupid = stupidThinking.nextInt(sizeOfthePilesLeft / 2) + 1;
		}
		System.out.println(
				"The computer took " + numOfMarblesInStupid + " of " + sizeOfthePilesLeft + " marbles." + "\n");
		return sizeOfthePilesLeft - numOfMarblesInStupid;
	}

	// Now we commence the game for playing in the nowStartingToPlay method declared
	// here
	public static void nowStartingToPlay(int decideTurning, int sizeofPile, int legal) {
		System.out.println("#############  HELLO, YOU ARE WELCOME TO THE GAME OF NIM.!!!  ################");
		System.out.println("YOU WILL PLAY WITH THE COMPUTER ITSELF" + "\n");
		System.out.println("The initial size of the pile is: " + sizeofPile);
		if (legal == 0) {
			System.out.println("The computer is currently set to the SMART MODE.");
		} else {
			System.out.println("The computer is currently set to the STUPID MODE.");
		}
		if (decideTurning == 0) {
			System.out.println("The computer take the first turn !!" + "\n");
		} else {
			System.out.println("You take the first turn !!" + "\n");
		}
		if (legal == 0 && decideTurning == 0 && (sizeofPile != 15 || sizeofPile != 31 || sizeofPile != 63)) {
			System.out.println("######### Note that this game would not be winnable. #########");
		}

	}
}
