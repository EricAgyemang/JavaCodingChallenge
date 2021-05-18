package edu.ilstu.it275.secondhalf;

public class Student extends Person {

	private String ulid;
		
	
	public Student(String firstName, String lastName, String ulid) {
		super(firstName, lastName);
		this.ulid=ulid;
	}

}
