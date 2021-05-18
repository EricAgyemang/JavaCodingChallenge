/**
 * 
 */
package edu.ilstu.it275.lab09.eagyem2;

/**
 * @author eagyem2
 *
 * This is an Employee testing class that test all classes declared.
 * These include the Employee class and the classes inheriting the
 * employee class
 */
public class EnployeeTesting {

	/**
	 * @param args
	 * 
	 * The main method is declared as main
	 */
	public static void main(String[] args) {

		// We invoke the Employee class and then print out the output of the inputs
		Employee employee = new Employee("Eric Agyemang", 15000);
		System.out.println("The new employee's details are: " + employee.toString());

		// We invoke the Manager class and then print out the output of the inputs
		Manager manager = new Manager("Richard Tierry", 13000, "marketing");
		System.out.println("\nThe managers details are: " + manager.toString());

		// We invoke the Executive class and then print out the output of the inputs
		Executive executive = new Executive("Naomi Garli", 23044, "Sales");
		System.out.println("\nThe details of the only lady in the office are: " + executive.toString());

		// We invoke the Manager class and then print out the output of the inputs
		Employee employeeToManager = new Manager("Jerry Rowlings", 22000, "Information Technology");
		System.out.println("\nThe details of the tranferred manager for this year are: " + employeeToManager.toString());

		// We invoke the Executive class and then print out the output of the inputs
		Manager managerToExecutive = new Executive("John Armah", 15500, "Data management");
		System.out.println("\nThe details of the executive manager are: " + managerToExecutive.toString());

		// We invoke the Executive class and then print out the output of the inputs
		Employee employeeToExecutive = new Executive("James Rich", 10000, "Sales");
		System.out.println("\nThe details on file for the executive member are: " + employeeToExecutive.toString());

	}

}
