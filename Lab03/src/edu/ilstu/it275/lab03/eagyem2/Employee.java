/**
 * 
 */
package edu.ilstu.it275.lab03.eagyem2;

import java.text.*;
/**
 * @author eagyem2
 *This is a class describing an Employee with given attributes
 */
public class Employee {
	
	// the attributes of the class are:
     private String name;
     private double salary;
  
     // providing a constructor with two arguments  
     // method name = class name
     //The purpose is to initialize the object attributes when object is created
     
     public Employee(String employeeName, double currentSalary) {
    	 name = employeeName;
    	 salary = currentSalary;    	 
     }
     
     
     
	/**
	 * @return the name
	 * Setting getters for name of the employee 
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the salary
	 * setting getters for salary of the employee 
	 */
	public double getSalary() {
		return salary;
	}

// the method raiseSalary is declared here
	public void raiseSalary (double byPercent) {
      salary = salary + (salary * byPercent)/100;
      
	}
	
	//using the NumberFormat to ensure that the salary is properly formated in dollars and cents.
    public String toString() { 
    	NumberFormat form = NumberFormat.getCurrencyInstance();
    	return "\nSalary: "+form.format(getSalary());
    	
        } 
	
}	
	


	
	
	
	
	

	
	


