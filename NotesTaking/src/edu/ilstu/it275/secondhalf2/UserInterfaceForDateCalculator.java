package edu.ilstu.it275.secondhalf2;

import java.util.Scanner;



public class UserInterfaceForDateCalculator {

	
	
	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  System.out.println("Please enter a year");
		  int year = Integer.parseInt(input.nextLine());
		  
//		  EasterDayCalculator calc = new EasterDayCalculator(); 
//		  calc.setYear(year);
//		  
		  //OR
		  EasterDayCalculator calc = new EasterDayCalculator(year); 
		  
		  
		 System.out.println("Easter is on "+ calc.getDateAsString());
		  input.close();
	}

}
