package edu.ilstu.it275.secondhalf;

public class Employee {
	private int hoursWorked;
	private int hourlyWage=15;
	private int salary;
	
	public int calculateSalary() {
		salary = 0;
		int regularSalary = hoursWorked*hourlyWage;		
		int overtimeSalary=0;
		
		if(hoursWorked>40) {
			//Any hours over 40 get 1.5 times the hourly wage
			 overtimeSalary = (hoursWorked-40)*(hourlyWage*2);
		}
		salary = regularSalary+overtimeSalary;
		return this.salary;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getSalary() {
		return salary;
	}

}
