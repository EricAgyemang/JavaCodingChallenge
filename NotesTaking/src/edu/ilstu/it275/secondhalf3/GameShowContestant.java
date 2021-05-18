/**
 * 
 */
package edu.ilstu.it275.secondhalf3;

import java.util.Scanner;

/**
 * @author eagyem2
 *
 */
public class GameShowContestant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiddenPrizeGameShow game = new HiddenPrizeGameShow();
//		System.out.println("D1: "+ game.getDoor1());
//		System.out.println("D2: "+ game.getDoor2());
//		System.out.println("D3: "+ game.getDoor3());
		Scanner input = new Scanner(System.in);
		System.out.println("Pleas guess a door 1 - 3 ");
		int doorGuessed = Integer.parseInt(input.nextLine());
		
		double prizeWon = game.getDoorPrize(doorGuessed);
		System.out.println("You guess door "+ doorGuessed + " which has a prize= "+ prizeWon);
		input.close();
	}

}
