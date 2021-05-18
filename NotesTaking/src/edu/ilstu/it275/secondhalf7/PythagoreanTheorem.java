/**
 * 
 */
package edu.ilstu.it275.secondhalf7;

/**
 * @author eagye
 *
 */
public class PythagoreanTheorem {
      private double sideA;
      private double sideB;
      private double height;
      
 //This default constructor allows for input
      public PythagoreanTheorem() {
    	  
      }
      
      public PythagoreanTheorem(double a, double b) {
    	  sideA=a;
    	  sideB=b;
      }

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
      
    public double getSideC() {
    	return Math.sqrt((sideA*sideA)+(sideB*sideB));
    }
      
    public double getHypothenuse() {
    	return getSideC();
    }
    
    
    public double getArea() {
    	return (0.5*getSideB()*getHeight());
    	
   
    }
}
