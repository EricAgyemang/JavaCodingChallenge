/**
 * 
 */
package edu.ilstu.it275.lab03.eagyem2;

/**
 * @author AGYEMANG ERIC
 * The class here is ProductPrinter and it makes two products, print each name and prices, and reduce their prices by $5
 */
public class ProductPrinter {

	/**
	 * @param args
	 * The main method is supplied here as main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the product1 is made here with it's parameter
		Product product1 = new Product("Toaster", 29.95);
		
		//the product2 is made here with it's parameter
		Product product2 = new Product("Blender", 85.95);
		
		//we print out the details of product1
		System.out.println("\nProduct1 details are:"+ "\nName: "+ product1.getName() +product1.toString());
		
		//we print out the details of product2
		System.out.println("\nProduct2 details are:"+ "\nName: "+ product2.getName() +product2.toString());
        
		// Reducing the price of each product by $5, we supply the code here
		product1.reducePrice(5.0);
		product2.reducePrice(5.0);
		
		//we print out the details of product1 reduced price
		System.out.println("\nProduct1's reduced price is" +product1.toString());

		//we print out the details of product2 reduced price
		System.out.println("\nProduct2's reduced price is" +product2.toString());
        
	}

}
