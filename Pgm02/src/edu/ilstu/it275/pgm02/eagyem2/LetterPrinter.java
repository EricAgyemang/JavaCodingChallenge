/**
 * 
 */
package edu.ilstu.it275.pgm02.eagyem2;


/**
 * @author eagyem2
 * This class prints the letter in this program
 * The name of the class is LetterPrinter
 *
 */
public class LetterPrinter {

	/**
	 * the main method is declared below as main.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking the Letter class using the "new" operator
    Letter johnLetter = new Letter("Mary", "John");
    
    // we print out the required output bellow.
    johnLetter.addLine("I am sorry we must part.");
    johnLetter.addLine("I wish you all the best.");
    
    System.out.println(johnLetter.getText());	
		
	}
	
	

}


