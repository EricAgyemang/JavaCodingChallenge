/**
 * 
 */
package edu.ilstu.it275.pgm02.eagyem2;

/**
 * @author eagyem2
 * This class provides the avenue for authoring a simple letter.
 * The class name here is Letter 
 */
public class Letter {
	 // Declaring the attributes of the class
     private String sender;
     private String recipient;
     private String body;

   /**
    * Construct a letter with a given sender and recipient.
   */
     public Letter(String from, String to) {
    	 //initializing the attributes above
         sender = from;
         recipient = to;
         body = "";
     
     }
   
   /**
    * We supply the method addLine to add a line of text to the body of the letter 
    */   
     public void addLine(String line) {
         body=body+line+"\n";
     }
   
   /**
      We supply the method below to return the entire text of the letter.
   */
     public String getText() {
	 return "Dear "+recipient+":\n\n"+body+"\n\nSincerely,\n\n"+sender;
   }
   
}