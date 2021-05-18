/**
 * 
 */
package edu.ilstu.it275.pgm08.eagyem2;

/**
 * @author eagyem2
 *
 * This is a class of zip code to bar code that This class makes
 * provision for accepting a zip code from a user and convert to a bar
 * code
 */
public class ZipCodeToBarCode {
	// Declaring attributes of the five digit code all together
	private int fiveDigitCode;

	// Declaring attributes of the check digit that will be chosen
	private int checkDigit;

	// Declaring attributes for each bar code
	private String zeroBarCode;
	private String firstBarCode;
	private String secondBarCode;
	private String thirdBarCode;
	private String forthBarCode;
	private String fithBarCode;
	private String sixthBarCode;
	private String seventhBarCode;
	private String eigthBarCode;
	private String ninthBarCode;

	// Declaring constructor for this class
	public ZipCodeToBarCode(int fiveDigitCode) {
		this.fiveDigitCode = fiveDigitCode;

		// Hard-coding the digits into bar code, : for half bars and | for full bars.
		zeroBarCode = "||:::";
		firstBarCode = ":::||";
		secondBarCode = "::|:|";
		thirdBarCode = "::||:";
		forthBarCode = ":|::|";
		fithBarCode = ":|:|:";
		sixthBarCode = ":||::";
		seventhBarCode = "|:::|";
		eigthBarCode = "|::|:";
		ninthBarCode = "|:|::";

	}

//Declaring the get check digit method to get each bar code by adopting the switch statement
//Here, we check for the check digits from 0 to 9 using the switch case method

	public String getCheckDigit(int digit) {
		String checkDigit = "";
		switch (digit) {
		case 0:
			checkDigit = zeroBarCode;
			break;
		case 1:
			checkDigit = firstBarCode;
			break;
		case 2:
			checkDigit = secondBarCode;
			break;
		case 3:
			checkDigit = thirdBarCode;
			break;
		case 4:
			checkDigit = forthBarCode;
			break;
		case 5:
			checkDigit = fithBarCode;
			break;
		case 6:
			checkDigit = sixthBarCode;
			break;
		case 7:
			checkDigit = seventhBarCode;
			break;
		case 8:
			checkDigit = eigthBarCode;
			break;
		case 9:
			checkDigit = ninthBarCode;
			break;
		}
		return checkDigit;
	}

	// We extract each digit out of the ZIP code that will be inputed by a user
	public String getBarcode() {
		int firstDigit = fiveDigitCode / 10000;
		int secondDigit = ((fiveDigitCode / 1000) - firstDigit * 10);
		int thirdDigit = (fiveDigitCode / 100 - (firstDigit * 100 + secondDigit * 10));
		int fourthDigit = (fiveDigitCode / 10 - (firstDigit * 1000 + secondDigit * 100 + thirdDigit * 10));
		int fifthDigit = (fiveDigitCode
				- (firstDigit * 10000 + secondDigit * 1000 + thirdDigit * 100 + fourthDigit * 10));
		checkDigit = 100 - (firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit);

		// We set the condition to get the check digits that are greater than 10 using a
		// loop
		while (checkDigit > 10) {
			checkDigit -= 10;
		}

		// Using the getCheckDiget method above, we generate the bar code for each digit
		String result = "|";
		result += getCheckDigit(firstDigit);
		result += getCheckDigit(secondDigit);
		result += getCheckDigit(thirdDigit);
		result += getCheckDigit(fourthDigit);
		result += getCheckDigit(fifthDigit);
		result += getCheckDigit(checkDigit);
		result += "|";
		return result;
	}
}
