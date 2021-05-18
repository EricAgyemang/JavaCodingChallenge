/**
 * 
 */
package edu.ilstu.it275.secondhalf3;

import java.util.Random;

/**
 * @author eagyem2
 *
 */
public class HiddenPrizeGameShow {
     private double prize;
     private double door1;
     private double door2;
     private double door3;
     
     public HiddenPrizeGameShow() {
    	 Random rand = new Random();
    	 int doorNbr = rand.nextInt(3)+1; // This gives us numbers 0,1, and 2 so we add 1 to get the 3
    	 prize = rand.nextDouble()*10_000;
    	 switch(doorNbr) {
    	 case 1:
    		 door1=prize;
    		 break;
    	 case 2:
    		 door2=prize;
    		 break;
    	 case 3: 
    		 door3 =prize;
    		 break;
    	 }
    	 
     }

     public double getDoorPrize(int doorNumber) {
    	 if(doorNumber==1) {
    		 return getDoor1();
    	 }else if (doorNumber==2) {
    		 return getDoor2();
    	 }else if (doorNumber==3) {
    		 return getDoor3();
    	 }else {
    		 return 0;
    	 }
     }
     
     
	public double getDoor1() {
		return door1;
	}

	public double getDoor2() {
		return door2;
	}

	public double getDoor3() {
		return door3;
	}
}
