/**
 * 
 */
package edu.ilstu.edu.it275.lab02partii.eagyem2;

import java.util.Random;
/**
 * @author AGYEMANG ERIC
 * This program is a program LotteryPrinter that picks a combination in a lottery
 * The class name is LotteryPrinter indicated
 */
public class LotteryPrinter {

	/**
	 * @param args
	 * The main method of the program is indicated
	 */
	public static void main(String[] args) {
		
		// The random generator is declared bellow.
		Random lotteryGenerator = new Random();
		
		// Randomly choosing the six numbers (possibly repeated) between 1 and 49 as required
		System.out.println("Play this combination—it’ll make you rich!");
		System.out.println(lotteryGenerator.nextInt(49)+1);
		System.out.println(lotteryGenerator.nextInt(49)+1);
		System.out.println(lotteryGenerator.nextInt(49)+1);
		System.out.println(lotteryGenerator.nextInt(49)+1);
		System.out.println(lotteryGenerator.nextInt(49)+1);
		System.out.println(lotteryGenerator.nextInt(49)+1);
	}

}


