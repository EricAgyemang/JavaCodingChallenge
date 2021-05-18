/**
 * 
 */
package edu.ilstu.it275.pgm12.eagyem2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author eagyem2
 * 
 * This is the class of HtmlCheck that helps to checks whether a
 * sequence of HTML tags is properly nested
 *
 */
public class HtmlTagCheck {

	// We declare the method htmlNestedproperly which is a boolean to actually run
	// the check for proper nest
	public static boolean htmlNestedProperly(String html) {

		// We declare the Linked list here
		List<String> tags = new LinkedList<>();

		// we declare the variable htmlTage here
		String htmlTag[] = html.split("\\n");

		// Use the for loop to check the conditions for the htmlTag length
		for (int i = 0; i < htmlTag.length; i++) {

			// declare a variable theLines of String type
			String theLines = htmlTag[i];

			// declare a while loop up to index -1
			while (theLines.indexOf("<") != -1) {
				int startHtmlIndex = theLines.indexOf("<");

				// variable is compared to -1
				if (startHtmlIndex == -1) {

					// Use the break statement to show out of loop
					break;
				}

				// Declare the variable htmltageClose of the boolean type
				boolean htmlTagClose = theLines.charAt(startHtmlIndex + 1) == '/';
				int endHtmlIndex = theLines.indexOf(">");

				// Use if statement to access end of variable compared
				if (endHtmlIndex == -1 || endHtmlIndex > theLines.length()) {
					break;
				}

				// Declare the variable newTage
				String newTag = theLines.substring(startHtmlIndex + 1, endHtmlIndex);

				String tagName = "";

				// Use the if else statement to run a loop for htmlTag closing
				if (htmlTagClose) {
					tagName = theLines.substring(startHtmlIndex + 2, endHtmlIndex);
					tags.remove(tags.size() - 1);
				} else {
					tagName = newTag.split("")[0];
					tags.add(tagName);
				}
				theLines = theLines.substring(endHtmlIndex + 1);
			}
		}
		// return tags is empty
		return tags.isEmpty();
	}
}
