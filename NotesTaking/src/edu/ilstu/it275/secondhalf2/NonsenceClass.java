package edu.ilstu.it275.secondhalf2;

public class NonsenceClass {
    private int year;
    private int dayOfMonth;
    private int monthOfYear;
    
    // # important things to note
    //#1 Attributes are usable within any function
    //#2 Attributes may be "hidden" by parameters of the same name
    //#3 Attributes  may be "hidden" by locally declared variables of the same name 
    // the attribute reference must be qualified by this
    //#4 Local variables can not be duplicatively be defind
    //#5 variables declared within a block of code do not exist outside that block of code
	public void nonsenseFunction(int year) {
		 year = 4000;
		this.year = (int) year;
	}
	
	//OR
	public void nonsenseFunction2() {
		 int year = 4000;
		this.year = (int) year;
	}
	
}
