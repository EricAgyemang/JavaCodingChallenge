/**
 * 
 */
package edu.ilstu.it275.seondhalf;


/**
 * @author eagye
 *
 */
public class Coin {
	private String coinName;
	private double coinValue;
	
	public Coin() {
		
		Coin[] coinName = new Coin[5];	
	}
	
	public Coin(double value) {
		this();
		coinValue = value;
	}

	public String getCoinName() {
		return coinName;
	}

	public double getCoinValue() {
		return coinValue;
	}

	@Override
	public String toString() {
		return "Coin [coinName=" + coinName + ", coinValue=" + coinValue + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean retVal = false;
		
		if (obj instanceof Coin) {
			Coin ci = (Coin) obj;
			retVal = equals(ci);
		}
		return retVal;
	}

	public boolean equals(Coin obj) {
		boolean retVal = false;
		retVal =this.coinName.equals(obj.coinName);
		return retVal;
	}

	
}
