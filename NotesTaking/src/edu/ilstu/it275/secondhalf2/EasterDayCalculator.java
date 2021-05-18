package edu.ilstu.it275.secondhalf2;

import java.util.Random;

public class EasterDayCalculator {
   private int year;
   private int dayOfMonth;
   private int monthOfYear;

// This portion wouldn't be there if we want to use the first part of UserInterfaceForDateCalculator.java part 
//Alternative for the setYear method to help user input year straight forward
   public EasterDayCalculator(){}
   public EasterDayCalculator(int year) {
	   setYear(year);
   }
   
   
   private void calculateEasterDayofMonthOfYear() {
	   //big long calculation (skip that for example purposes)
	   Random  rand = new Random();
	   dayOfMonth =rand.nextInt(28)+1;
	   monthOfYear = rand.nextInt(12)+1;
	   
   }
	public int getYear() {
	return year;
}


public void setYear(int year) {
		this.year = year;
		calculateEasterDayofMonthOfYear();
	}



public int getDayOfMonth() {
	return dayOfMonth;
}



public int getMonthOfYear() {
	return monthOfYear;
}
public String getDateAsString() {
	return monthOfYear + "/"+ dayOfMonth+ "/"+ year;
}

}
