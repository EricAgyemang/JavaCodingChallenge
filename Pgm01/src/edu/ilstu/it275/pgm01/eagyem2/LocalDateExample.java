/**
 * 
 */
package edu.ilstu.it275.pgm01.eagyem2;

import java.time.LocalDate;
/**
 * @author eagyem2
 * This program prints set of statements on LocalDate
 * The class here is define as LocalDateExample and represent the local date that describes a calendar date that does not depend on a location or time zone
 */
public class LocalDateExample {
	/**
	 * @param args
	 * This program prints some statements on Local date
	 * The main method is stated below
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				/**
				 * Moving on to the first problem
				 * We divide the problem into two parts, today's date and weekday of Pi day and code them separately
				 */
				
				// Today's date 
			    LocalDate today = LocalDate.now();
				        
				//We get the year of today
				int currentYear = today.getYear();
				        
				// Displaying the current year to help us locate the exact days within that year
			    System.out.println("The current year is " + currentYear+ ".");
				        			    
		
			  //We get the weekday of the local date for the Pi day in the current year
				LocalDate piDay = LocalDate.of(2021,3,14);
				String weekday = piDay.getDayOfWeek().toString();
				        
				// We print out the statement as required in the problem
				System.out.println("The weekday of Pi day, that is, March 14, of " +currentYear+". That day is " +  weekday+ ".");
									
				
				/**
				 * Moving on to the next problem
				 * We divide the problem into two parts, the date, and the weekday of programmer's day and code them separately
				 * The date of programmer's day in the current year; that is the 256th day of the current year is first obtained
				 */
				LocalDate currentYearBegins = LocalDate.of(2021,1,1);
		        LocalDate later = currentYearBegins.plusDays(255); 							
				//print out the date for proframmer's day in the current year
				System.out.println("The date of programmer's day in "+ currentYear + " is "  + later+ ".");	
				
				
				//We get the weekday of the local date for the programmer's day in the current year
				String weekdayOfProgrammersDay = later.getDayOfWeek().toString();		        
				// we print out the statement required in the problem
				System.out.println("The weekday of prgrammer's day in " + currentYear + "; that is the 256th day of the year (The number 256, or 2^8, is useful for some programming tasks).");
				System.out.println("That weekday is " + weekdayOfProgrammersDay+ ".");

							
				
				/**
				 * Moving on to the next problem
				 * We divide the problem into two parts, date and weekday of 10,000 days earlier than today and code them separately
				 */	
		      
				// The date of the date that is 10,000 days earlier than today
				LocalDate earlier = today.minusDays(10000);
				System.out.println("The date of the date that is 10,000 days earlier than today is " + earlier + ".");
		        
				//The weekday of the date that is 10,000 days earlier than today						
				String weekdayOfEarlier = earlier.getDayOfWeek().toString();
		        System.out.println("That weekday is " + weekdayOfEarlier+ ".");
		
	}

}
