package edu.ilstu.it275.seondhalf;

public class Car extends Vehicle {
     private String name;
     private String vin;
     
     @Override
     public void drive() {
 		System.out.println("Driving a car ....");
 	}
     
     @Override
     public void stop() {
 		System.out.println("Car has Stopped...");
 	}	
      
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}	
    @Override
	public String toString() {
    	String retVal = super.toString();
    	retVal +="\nname:"+name+"\nvin:"+vin;
    	return retVal;
    }

	}


