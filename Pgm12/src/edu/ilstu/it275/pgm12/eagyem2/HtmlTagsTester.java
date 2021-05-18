/**
 * 
 */
package edu.ilstu.it275.pgm12.eagyem2;

/**
 * @author eagyem2
 * 
 * This is a class of HtmlTagsTester that test the nested tags in the program 
 * to actually check if properly nested
 *
 */
public class HtmlTagsTester {

	/**
	 * @param args
	 * 
	 * The main method is declared here as main
	 */
	public static void main(String[] args) {
		
		    //We declare a variable htmlTags and store the nested tags to that variable
			String htmlTags =  "<img title=\"displays\" src=\"big.gif\"></img><p> <ul> <li> </li> </ul> <a> </a> </p>";
			
			//We print out a statement to inform the user about the inputed nested tags 
			System.out.println("The HTML tags are:\n "+ htmlTags);
			
			//We check nesting of html tags here
			if(HtmlTagCheck.htmlNestedProperly(htmlTags)) {
				System.out.println("\nThis HTML content is properly nested");
			}else {
				System.out.println("\nThis HTML content is not is properly nested");
			}
		}		
	}
