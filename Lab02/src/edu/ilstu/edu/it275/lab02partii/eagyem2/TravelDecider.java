/**
 * 
 */
package edu.ilstu.edu.it275.lab02partii.eagyem2;

/**
 * @author eagyem2
 * *This application helps to decide which commute is cheaper for going to work.
 *Here, one can decide whether to drive a car or take the train based on cost efficiency.
 *
 *The class for this section is TravelDecider indicated below
 */
public class TravelDecider {

	/**
	 * @param args
	 * The main method is indicated bellow
	 */
	public static void main(String[] args) {

		// the variables: fuel efficiency and cost of gas for commute by car 
	    double costOfGas = 4;
	    double mpg = 18;
	    
	    // The variables: distance from home to work in mile and car maintenance cost in dollars per mile
	    double distanceToWork = 73;
	    double carMaintenanceCost = 0.05; // we convert 5 cent to 0.05 dollars. 
	    

	    // We compute the cost of fuel for the today distance and total maintenance cost for total distance
	    double fuelUsed = distanceToWork/mpg;
	    double fuelCost = costOfGas*fuelUsed;
	    double carMaintenanceCostTotal = distanceToWork*carMaintenanceCost;
	    
	    
	    // cost of driving the car to work is computed
	    double cost = fuelCost+carMaintenanceCostTotal;
	    
	    
        //cost of commute by train
	    double trianTicketPrice = 20;
	    
	    //showing the output for both car and train cases
	    System.out.println("Cost of commute by car is: $" + cost);
	    System.out.println("Cost of commute by train is: $" + trianTicketPrice);
	    
	    //deciding on which medium of commute is cheaper using if else statement.
        if (trianTicketPrice < cost) 
        {
        	System.out.println("Hence we decide that the cost of commute by train is cheaper and is: $"+ trianTicketPrice);
	    }
        else
        {
        	System.out.println("Hence we decide that the cost of commute by car is cheaper and is: $"+ cost);	
        	
        }
        
	}
}
