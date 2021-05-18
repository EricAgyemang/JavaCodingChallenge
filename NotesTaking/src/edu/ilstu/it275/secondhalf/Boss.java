package edu.ilstu.it275.secondhalf;

public class Boss {

	public static void main(String[] args) {
		Employee  kelvin = new Employee();
		kelvin.setHoursWorked(60);
		int salary = kelvin.calculateSalary();
		 System.out.println(salary);
	}

}
