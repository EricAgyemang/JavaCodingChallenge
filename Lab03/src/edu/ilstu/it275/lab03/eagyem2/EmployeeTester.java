/**
 * 
 */
package edu.ilstu.it275.lab03.eagyem2;

/**
 * @author eagyem2
 * We supply an EmployeeTester class that tests all methods.
 */
public class EmployeeTester {
	/**
	 * The main method is declared and we invoke the Employee's class
	 */
	 public static void main(String[] args) {
		 
	// TODO Auto-generated method stub	
	Employee harry = new Employee("Hacker, Harry", 50000);
	
	//print out the required solution results.
    System.out.println("Employee Name: " + harry.getName());
    System.out.println("The employee's salary is "+ harry.toString());
    
    //We raise the salary by 10% by supplying the code here
    harry.raiseSalary(10);
    System.out.println("Raising the employee's salary by 10 percent  makes the new salary to be "+ harry.toString());

	
	 }
	 
}


