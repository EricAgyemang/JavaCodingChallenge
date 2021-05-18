/**
 * 
 */
package edu.ilstu.it275.lab03.eagyem2;

import java.text.NumberFormat;


/**
 * @author AGYEMANG ERIC
 *This is a Product class that is created with attribute name and price.
 */
public class Product {
	private String name;
	private double price;
	
	// initializing the attributes of the product class
	public Product(String name, double price) {
		this.name = name;
		this.price = price;	
	}
	

	/**
	 * @return the name
	 * Using getters to apply to the Name attribute in order to make it accessible
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the price
	 * Using getters to apply to the price attribute in order to make it accessible
	 */
	public double getPrice() {
		return price;
	}
    // supplying the reducePrice method here
     public void reducePrice(double amount) {
	     price-=amount;
	
     }
//using the NumberFormat to ensure that the salary is properly formated in dollars and cents.
public String toString() { 
	NumberFormat form = NumberFormat.getCurrencyInstance();
	return "\nPrice: "+form.format(getPrice());
	
    } 

}
