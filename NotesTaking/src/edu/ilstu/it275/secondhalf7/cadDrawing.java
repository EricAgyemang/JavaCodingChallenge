package edu.ilstu.it275.secondhalf7;

public class cadDrawing {

	public static void main(String[] args) {
		PythagoreanTheorem calc = new PythagoreanTheorem(15, 20);
		
		double sideC = calc.getSideC();
		
		System.out.println(sideC);
		
		
	}

}
